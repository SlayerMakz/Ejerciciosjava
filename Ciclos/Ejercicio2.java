package Ciclos;
import javax.swing.JOptionPane;
public class Ejercicio2 {
    /* Ingresar un numero e indicar si es negativo o positivo. */
    public static void main(String[] args) {
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: ")); 
        while (numero !=0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero: "+numero+" es positivo.");
            }
            else if (numero < 0){
                JOptionPane.showMessageDialog(null, "El numero: "+numero+" es negativo.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: ")); 
        }
    }
}
