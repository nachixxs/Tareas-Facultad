import javax.swing.JOptionPane;

public class Ejercicio4J {
    public static void main(String[] args) {
        int numero;
        int contador = 0;

        do {
            String input = JOptionPane.showInputDialog("Introduce un número: ");
            numero = Integer.parseInt(input);

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números.");
    }
}