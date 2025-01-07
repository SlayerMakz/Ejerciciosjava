package Condicionales;
import javax.swing.JOptionPane;
/*
 Perdir un número entre 0 y 99,999 y decir cuantas cifras tiene
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int num; 
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (num <= 9){
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es de 1 cifra: "+num);
        }
        else if(num > 9 && num <= 99){
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es de 2 cifras: "+num);
        }
        else if(num > 99 && num <= 999){
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es de 3 cifras: "+num);
        }
        else if (num > 999 && num <= 9999){
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es de 4 cifras: "+num);
        }
        else if (num > 9999 && num <= 99999){
            JOptionPane.showMessageDialog(null, "El numero que ingresaste es de 5 cifras: "+num);
        }
    }
}
