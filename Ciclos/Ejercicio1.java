
package Ciclos; 
import javax.swing.JOptionPane;
public class Ejercicio1{
    /*
        Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. 
     */
    public static void main(String[] args) {
        int numero, cuadrado, resultado; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        cuadrado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero al que se va a elevar: "));

        while (numero >= 0){ //Mientras el numero sea 0 o positivo
            resultado = (int)Math.pow(numero, cuadrado);
            JOptionPane.showMessageDialog(null, "El numero "+numero+" elevado al cuadrado es: "+resultado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            cuadrado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero al que se va a elevar: "));
        }
    }
}

