package Ciclos;
import javax.swing.JOptionPane;;
public class Ejercicio6 {
    /* Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos. */
    public static void main(String[] args) {
        int numero, suma = 0; 
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
            suma+=numero;
        }
        while (numero !=0);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma);
    }
}
