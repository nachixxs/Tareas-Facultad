import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;

        do {
            System.out.print("Introduce un número (negativo para terminar): ");
            num = scanner.nextDouble();
            if (num >= 0) {
                double cuadrado = Math.pow(num, 2);
                System.out.println("El cuadrado de " + num + " es " + cuadrado);
            }
        } while (num >= 0);

        System.out.println("Programa terminado (Numero Negativo no computable).");
        scanner.close();
    }
}