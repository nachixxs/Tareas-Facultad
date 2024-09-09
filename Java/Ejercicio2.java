import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            }
        } while (numero != 0);

        System.out.println("Fin del programa.");
        scanner.close();
    }
}