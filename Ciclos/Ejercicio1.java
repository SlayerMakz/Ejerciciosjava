package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    /*
        Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. 
     */
    public static void main(String[] args) {
        int numero, cuadrado; 

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (numero >= 0 ){
            // Mientras el numero sea 0 o positivo 
            cuadrado = (int)Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El número "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
    }
}
