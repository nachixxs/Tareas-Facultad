import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        System.out.println("Se han introducido " + contador + " números.");
        scanner.close();
    }
}