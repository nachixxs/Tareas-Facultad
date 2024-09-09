import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            }

        } while (numero != 0);

        System.out.println("Fin del programa.");
        scanner.close();
    }
}