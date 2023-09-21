import java.util.Scanner;
import java.util.*;
public class Main {

    public static Torre torre1 = new Torre("Torre 1", 12, "Parqueadero 1");
    public static Torre torre2 = new Torre("Torre 2", 12, "Parqueadero 2");
    public static Torre torre3 = new Torre("Torre 3", 12, "Parqueadero 3");

    public static void cancelar_parqueadero(int v){
        Scanner in = new Scanner(System.in);
        int valor = v;
        int saldo = 0;

        System.out.println("--- Saldo: " + saldo + "$ ---\n");
        System.out.println("Valor a pagar: " + valor);
        System.out.print("Ingrese el dinero: ");
        valor -= in.nextInt();

        while (valor > 0){
            System.out.print("Falta $" + valor + ", inregese el valor faltante: ");
            valor -= in.nextInt();
        }

        saldo = -1 * valor;
        System.out.println("\nPago confirmado!");
        System.out.println("Le queda $" + saldo + " a favor en la cuenta.");
        System.out.println("Buen viaje!");

        in.close();
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de parqueo vertical!");
        System.out.println("A continuacion vamos a pedir cierta informacion basica para poder brindar el servicio.");

        // Recolectar datos del usuario
        System.out.print("Nombre completo: ");
        String nombre = in.nextLine();
        System.out.print("Placa del carro: ");
        String placa = in.nextLine();

        // Gestionar los parqueaderos
        System.out.println("\nRevisando parqueaderos libres...");;
        if (torre1.libre() || torre2.libre() || torre3.libre()){
            System.out.println("Listo " + nombre + ", hay parqueaderos disponibles");
            System.out.println("Enseguida te indicaremos las torres");
        } else {
            System.out.println(nombre + ", por el momento no hay parqueaderos");
            System.exit(0);
        }

        // Guiar al usuario
        String opciones = "| ";
        if (torre1.libre()){
            opciones += torre1.get_nombre() + " | ";
        }
        if (torre2.libre()){
            opciones += torre2.get_nombre() + " | ";
        }
        if (torre3.libre()) {
            opciones += torre3.get_nombre() + " | ";
        }
        System.out.println("\nLas siguentes torres estan disponibles: \n" + opciones);
        System.out.print("Elija una de ellas (1|2|3): ");
        int eleccion = in.nextInt();

        if (eleccion == 1){
            System.out.println("La Torre " + eleccion + " queda por: " + torre1.get_lugar());
            torre1.actualizar(1);
        } else if (eleccion == 2){
            System.out.println("La Torre " + eleccion + " queda por: " + torre2.get_lugar());
            torre2.actualizar(1);
        } else if (eleccion == 3){
            System.out.println("La Torre " + eleccion + " queda por: " + torre3.get_lugar());
            torre3.actualizar(1);
        } else {
            System.out.println("Elija una opcion valida");
            System.exit(0);
        }

        // Generar y cancelar el pago electronico
        System.out.println("\nTienes pendiente cancelar el parqueadero.");
        int TARIFA = 6000;
        cancelar_parqueadero(TARIFA);
        if (eleccion == 1){
            torre1.actualizar(0);
        } else if (eleccion == 2){
            torre2.actualizar(0);
        } else {
            torre3.actualizar(0);
        }

        in.close();
    }
}
