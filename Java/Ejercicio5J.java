import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio5J {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);
        int intento;
        int intentos = 0;

        do {
            String input = JOptionPane.showInputDialog("Adivina el número (entre 0 y 100): ");
            intento = Integer.parseInt(input);
            intentos++;

            if (intento < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número es mayor.");
            } else if (intento > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número es menor.");
            }

        } while (intento != numeroAleatorio);

        JOptionPane.showMessageDialog(null, "Has adivinado el numero.");
        JOptionPane.showMessageDialog(null, "Número de intentos: " + intentos);
    }
}