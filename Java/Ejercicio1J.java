import javax.swing.*;

public class Ejercicio1J {
    public static void main(String[] args) {
        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));
            if (num >= 0) {
                double cuadrado = Math.pow(num, 2);
                System.out.println("El cuadrado de " + num + " es " + cuadrado);
            }
        } while (num >= 0);

        System.out.println("Programa terminado (Numero Negativo no computable).");
    }
}