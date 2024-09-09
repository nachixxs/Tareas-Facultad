import javax.swing.JOptionPane;

public class Ejercicio3J {
    public static void main(String[] args) {
        int numero;

        do {
            String input = JOptionPane.showInputDialog("Introduce un número: ");
            numero = Integer.parseInt(input);

            if (numero != 0) {
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El número es par.");
                } else {
                    JOptionPane.showMessageDialog(null, "El número es impar.");
                }
            }

        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Fin del programa.");
    }
}