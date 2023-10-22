import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class Database {
    private String path = "";

    public Database(String path){
        this.path = path;
    }

    public User nuevo_usuario(String nombre, String placa){
        ArrayList<Integer> ids = new ArrayList<Integer>();
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                String[] info = data.split(",");
                ids.add(Integer.parseInt(info[0]));
            }
        } catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo.");
        }

        int id = (int)(Math.random() * 990000) + 10000;
        while (ids.contains(id)){
            id = (int)(Math.random() * 990000) + 10000;
        }

        User usuario = new User(id, nombre, placa);
        return usuario;
    }
    public User recolectar_usuario(String placa){
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] info = data.split(",");
                if (info[2].equals(placa)){
                    User usuario = new User(Integer.parseInt(info[0]), info[1], info[2]);
                    return usuario;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo.");
        }
        return null;
    }

    public Billetera recolectar_billetera(int id){
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] info = data.split(",");
                if (Integer.parseInt(info[0]) == id){
                    Billetera billetera = new Billetera(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
                    return billetera;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
        return null;
    }

    public boolean usuario_adentro(int id){
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] info = data.split(",");
                if (Integer.parseInt(info[0]) == id && info[4].equals("#1")){
                    return true;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
        return false;
    }

    public void add_user(User usuario){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.append("\n" + usuario.get_id() + "," + usuario.get_nombre_completo() + "," + usuario.get_placa());
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
        }
    }

    public void add_billetera(Billetera billetera){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.append("\n" + billetera.get_id() + "," + billetera.get_saldo());
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
        }
    }

    public void add_entrada(int id, int torre){
        String fecha = "";
        fecha += java.time.LocalDate.now();
        String hora_entrada = "";
        hora_entrada += java.time.LocalTime.now();
        String[] hora = hora_entrada.split(":");
        hora_entrada = hora[0] + ":" + hora[1];
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.append("\n" + id + "," + torre + "," + fecha + "," + hora_entrada + ",#1");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
        }
    }

    public void add_salida(int id){
        String hora_salida = "";
        hora_salida += java.time.LocalTime.now();
        String[] hora = hora_salida.split(":");
        hora_salida = hora[0] + ":" + hora[1];
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            ArrayList<String> file_contents = new ArrayList<String>();

            // Recolectar los datos del archivo
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                file_contents.add(data);
            }

            // Actualizar el saldo de la billetera
            for (int i = 0; i < file_contents.size(); i++){
                String[] info = file_contents.get(i).split(",");
                if (Integer.parseInt(info[0]) == id && info[4].equals("#1")){
                    file_contents.set(i, file_contents.get(i).replace(info[4], hora_salida));
                    break;
                }
            }

            // Borrar el archivo y escribir los datos actualizados
            BufferedWriter wipe = new BufferedWriter(new FileWriter(path, false));
            wipe.write("");
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            for (int i = 0; i < file_contents.size(); i++){
                if (i != file_contents.size() - 1){
                    writer.append(file_contents.get(i) + "\n");
                } else {
                    writer.append(file_contents.get(i));
                }
            }

            wipe.close();
            writer.close();
            reader.close();
        } catch (IOException e){
            System.out.println("Ocurrio un error.");
        }
    }

    public void actualizar_torres(Torre torre1, Torre torre2, Torre torre3){
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] info = data.split(",");

                // Actualizar el estado de las torres
                if (info[1].equals("1") && info[4].equals("#1")){
                    torre1.ocupar();
                } else if (info[1].equals("2") && info[4].equals("#1")){
                    torre2.ocupar();
                } else if (info[1].equals("3") && info[4].equals("#1")){
                    torre3.ocupar();
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo.");
        }
    }

    public void actualizar_billetera(Billetera billetera){
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            ArrayList<String> file_contents = new ArrayList<String>();

            // Recolectar los datos del archivo
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                file_contents.add(data);
            }

            // Actualizar el saldo de la billetera
            for (int i = 0; i < file_contents.size(); i++){
                String[] info = file_contents.get(i).split(",");
                if (Integer.parseInt(info[0]) == billetera.get_id()){
                    info[1] = String.valueOf(billetera.get_saldo());
                    String line = info[0] + "," + info[1];
                    file_contents.set(i, line);
                    break;
                }
            }

            // Borrar el archivo y escribir los datos actualizados
            BufferedWriter wipe = new BufferedWriter(new FileWriter(path, false));
            wipe.write("");
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            for (int i = 0; i < file_contents.size(); i++){
                if (i != file_contents.size() - 1){
                    writer.append(file_contents.get(i) + "\n");
                } else {
                    writer.append(file_contents.get(i));
                }
            }

            wipe.close();
            writer.close();
            reader.close();
        } catch (IOException e){
            System.out.println("Ocurrio un error.");
        }
    }

    public boolean usuario_frecuente(int id){
        int count = 0;
        try {
            File myObj = new File(path);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] info = data.split(",");
                if (Integer.parseInt(info[0]) == id){
                    count++;
                }
            }
            reader.close();
            if (count % 10 == 0){
                return true;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo.");
        }
        return false;
    }
}
