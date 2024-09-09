import javax.swing.JOptionPane;

public class Ejercicio2J {
    public static void main(String[] args) {
        int numero;

        do {
            String input = JOptionPane.showInputDialog("Introduce un número: ");
            numero = Integer.parseInt(input);

            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número es positivo.");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número es negativo.");
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Fin del programa.");
    }
}