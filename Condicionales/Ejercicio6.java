package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio6 {
    /*Hacer un programa que tome dos numeros y diga si ambos son pares o impares */
    /* 
     == : igualdad
     != : diferencia
     >  : mayor
     >= : mayor o igual
     <  : menor
     <= : menor o igual 

     */
    public static void main(String[] args) {
        int num1, num2; 
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: ")); 
        if (num1%2==0 && num2%2==0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares: ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares: ");
        }
    }
}
