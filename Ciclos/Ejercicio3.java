package Ciclos;
import javax.swing.JOptionPane;
public class Ejercicio3 {
    /*
      Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. 
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while (numero !=0){
            if (numero %2 == 0){
                JOptionPane.showMessageDialog(null, "El numero es par.");
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero es impar.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
    }
}
