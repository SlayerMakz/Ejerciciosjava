package Ciclos;
import javax.swing.JOptionPane;
public class Ejercicio4 {
    /* Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido. */
    public static void main(String[] args) {
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0){
            System.out.println("El numero que ingresaste es: "+numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
    }
}
