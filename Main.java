import java.util.Scanner;

public class Main {

    public static Torre torre1 = new Torre("Torre 1", "cerca de la cancha norte");
    public static Torre torre2 = new Torre("Torre 2", "en el parqueadero de los profesores");
    public static Torre torre3 = new Torre("Torre 3", "cerca del bloque 19");

    public static Database usuarios = new Database("C:\\Users\\Pcabr\\IdeaProjects\\Vertical Parking\\usuarios.txt");
    public static Database entrada_salida = new Database("C:\\Users\\Pcabr\\IdeaProjects\\Vertical Parking\\entrada_salida.txt");
    public static Database billeteras = new Database("C:\\Users\\Pcabr\\IdeaProjects\\Vertical Parking\\billeteras.txt");

    public static boolean placa_valida(String placa){
        if (placa.length() == 6){
            for (int i = 0; i < placa.length(); i++){
                if (i < 3){
                    if (!Character.isLetter(placa.charAt(i))){
                        return false;
                    }
                } else {
                    if (!Character.isDigit(placa.charAt(i))){
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean nombre_valido(String nombre){
        if (nombre.length() > 3){
            for (int i = 0; i < nombre.length(); i++){
                if (!Character.isLetter(nombre.charAt(i)) && nombre.charAt(i) != ' '){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Tarifa del parqueadero
        int TARIFA = 6000;

        System.out.println("Sistema de parqueo vertical");

        // Verificar/Recolectar los datos del usuario
        System.out.print("Ingrese la placa del carro: ");
        String placa = in.nextLine();
        while (!placa_valida(placa)){
            System.out.print("Ingrese una placa valida: ");
            placa = in.nextLine();
        }
        placa = placa.toUpperCase();
        placa = placa.trim();

        User usuario = usuarios.recolectar_usuario(placa);

        if (usuario != null){
            System.out.println("Bienvenido de nuevo " + usuario.get_nombre() + "!");
        } else {
            System.out.println("Bienvenido, al parecer es la primera vez que nos visitas.");
            System.out.print("Por favor ingresa tu nombre completo: ");
            String nombre = in.nextLine();
            while (!nombre_valido(nombre)){
                System.out.print("Ingrese un nombre valido: ");
                nombre = in.nextLine();
            }
            nombre = nombre.trim();
            if (nombre.indexOf(' ') != -1){
                String[] nombre_completo = nombre.split(" ");
                nombre = "";
                for (int i = 0; i < nombre_completo.length; i++){
                    if (i == 0){
                        nombre += nombre_completo[i].substring(0, 1).toUpperCase() + nombre_completo[i].substring(1).toLowerCase();
                    } else {
                        nombre += " " + nombre_completo[i].substring(0, 1).toUpperCase() + nombre_completo[i].substring(1).toLowerCase();
                    }
                }
            } else {
                nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
            }
            usuario = usuarios.nuevo_usuario(nombre, placa);
            usuarios.add_user(usuario);
        }

        // Revisar usuario frecuente y dar descuento
        if (entrada_salida.usuario_frecuente(usuario.get_id())){
            TARIFA = (int) (TARIFA * 0.80);
        }

        // Verificar/Recolectar los datos de la billetera
        Billetera billetera = billeteras.recolectar_billetera(usuario.get_id());
        if (billetera == null){
            billetera = new Billetera(usuario.get_id(), 0);
            billeteras.add_billetera(billetera);
        }

        // Verificar si el usuario ya habia ingresado
        if (entrada_salida.usuario_adentro(usuario.get_id())){

            // Preguntar si el usuario quiere pagar ahora o despues
            System.out.println("\nTienes pendiente cancelar el parqueadero.");
            System.out.println("Quieres continuar con el pago?\n1. Si\n2. No");
            System.out.print("Opcion: ");
            int opcion = in.nextInt();
            while (opcion != 1 && opcion != 2){
                System.out.print("Ingrese una opcion valida: ");
                opcion = in.nextInt();
            }

            if (opcion == 2){
                System.out.println("\nRecuerda cancelar el parqueadero para salir!");
                System.exit(0);
            }

            // Generar y mostrar el pago
            if (billetera.get_saldo() >= TARIFA){
                System.out.println("\n--- Saldo: " + billetera.get_saldo() + "$ ---");

                // Mostrar el descuento si el usuario es frecuente
                if (entrada_salida.usuario_frecuente(usuario.get_id())){
                    System.out.println("DESCUENTO: 20%");
                }
                System.out.println("Tarifa: " + TARIFA + "$");
                billetera.retirar(TARIFA);
                System.out.println("Pago confirmado!");
                System.out.println("\nTu saldo actualizado es de " + billetera.get_saldo() + "$");

            } else {
                System.out.println("\n--- Saldo: " + billetera.get_saldo() + "$ ---");

                // Mostrar el descuento si el usuario es frecuente
                if (entrada_salida.usuario_frecuente(usuario.get_id())){
                    System.out.println("DESCUENTO: 20%");
                }
                System.out.println("Tarifa: " + TARIFA + "$");
                int valor = TARIFA - billetera.get_saldo();
                billetera.retirar(billetera.get_saldo());
                System.out.println("Valor a pagar: " + valor + "$");
                System.out.print("Ingrese el dinero: ");
                valor -= in.nextInt();

                while (valor > 0){
                    System.out.print("Falta $" + valor + ", inregese el valor faltante: ");
                    valor -= in.nextInt();
                }

                System.out.println("Pago confirmado.");
                System.out.println("\nLe queda $" + (-1 * valor) + " a favor en la cuenta.");
                billetera.depositar(valor * -1);
            }

            // Actualizar los datos de la billetera
            billeteras.actualizar_billetera(billetera);

            // Liberar el parqueadero y finalizar el servicio
            entrada_salida.add_salida(usuario.get_id());
            System.out.println("Vuelva pronto!");

        } else {

            // Gestionar los parqueaderos
            System.out.println("\nRevisando parqueaderos libres...");
            entrada_salida.actualizar_torres(torre1, torre2, torre3);
            if (torre1.libre() || torre2.libre() || torre3.libre()) {
                System.out.println(usuario.get_nombre() + ", hay parqueaderos disponibles!");
            } else {
                System.out.println(usuario.get_nombre() + ", por el momento no hay parqueaderos.");
                System.exit(0);
            }

            // Guiar al usuario y actualizar el estado de los parqueaderos
            String opciones = "";
            if (torre1.libre()) {
                opciones += "1. Torre 1 \n";
            }
            if (torre2.libre()) {
                opciones += "2. Torre 2 \n";
            }
            if (torre3.libre()) {
                opciones += "3. Torre 3 \n";
            }

            System.out.println("\nLas siguientes torres estan libres:\n" + opciones);
            System.out.print("Elija una torre: ");
            int eleccion = in.nextInt();
            while (eleccion < 1 || eleccion > 3) {
                System.out.print("Ingrese una opcion valida: ");
                eleccion = in.nextInt();
            }

            if (eleccion == 1) {
                System.out.println("Ten en cuenta que la " + torre1.get_nombre() + " queda " + torre1.get_lugar());
            } else if (eleccion == 2) {
                System.out.println("Ten en cuenta que la " + torre2.get_nombre() + " queda " + torre2.get_lugar());
            } else if (eleccion == 3) {
                System.out.println("Ten en cuenta que la " + torre3.get_nombre() + " queda " + torre3.get_lugar());
            }
            entrada_salida.add_entrada(usuario.get_id(), eleccion);

            // Preguntar si el usuario quiere pagar ahora o despues
            System.out.println("\nTienes pendiente cancelar el parqueadero.");
            System.out.println("Quieres pagar ya?\n1. Si\n2. No");
            System.out.print("Opcion: ");
            int opcion = in.nextInt();
            while (opcion != 1 && opcion != 2) {
                System.out.print("Ingrese una opcion valida: ");
                opcion = in.nextInt();
            }

            if (opcion == 2) {
                System.out.println("\nGracias por usar el sistema de parqueo vertical!");
                System.out.println("Recuerda cancelar el parqueadero para salir.");
                System.exit(0);
            }

            // Generar y mostrar el pago
            if (billetera.get_saldo() >= TARIFA) {
                System.out.println("\n--- Saldo: " + billetera.get_saldo() + "$ ---");

                // Mostrar el descuento si el usuario es frecuente
                if (entrada_salida.usuario_frecuente(usuario.get_id())){
                    System.out.println("DESCUENTO: 20%");
                }
                System.out.println("Tarifa: " + TARIFA + "$");
                billetera.retirar(TARIFA);
                System.out.println("Pago confirmado.");
                System.out.println("\nTu saldo actualizado es de " + billetera.get_saldo() + "$");

            } else {
                System.out.println("\n--- Saldo: " + billetera.get_saldo() + "$ ---");

                // Mostrar el descuento si el usuario es frecuente
                if (entrada_salida.usuario_frecuente(usuario.get_id())){
                    System.out.println("DESCUENTO: 20%");
                }
                System.out.println("Tarifa: " + TARIFA + "$");
                int valor = TARIFA - billetera.get_saldo();
                billetera.retirar(billetera.get_saldo());
                System.out.println("Valor a pagar: " + valor + "$");
                System.out.print("Ingrese el dinero: ");
                valor -= in.nextInt();

                while (valor > 0) {
                    System.out.print("Falta $" + valor + ", inregese el valor faltante: ");
                    valor -= in.nextInt();
                }

                System.out.println("Pago confirmado.");
                System.out.println("\nLe queda $" + (-1 * valor) + " a favor en la cuenta.");
                billetera.depositar(valor * -1);
            }

            // Actualizar la billetera
            billeteras.actualizar_billetera(billetera);

            // Liberar el parqueadero y finalizar el servicio
            entrada_salida.add_salida(usuario.get_id());
            System.out.println("Vuelva pronto!");
        }

        in.close();
    }
}
