import java.util.Scanner;
import java.lang.*;
class Main {
  static void cancelar_parqueadero(int v){

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
        
    // Llevar a cabo el pago
    System.out.println("Tienes pendiente cancelar el parqueadero.");
    int TARIFA = 6000;
    cancelar_parqueadero(TARIFA);


    in.close();
  }
}
