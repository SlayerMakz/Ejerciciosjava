package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {
        /*Pedir 3 numeros y mostrarlos ordenados de mayor a menor. */
        int num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
        if ((num1>num2) && (num2>num3)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: "+num1+" - "+num2+" - "+num3);
        }
        else if((num1>num3) && (num3>num2)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros: "+num1+" - "+num3+" - "+num2);
        }
        else if ((num2>num1) && (num1>num3)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros: "+num2+" - "+num1+" - "+num3);
        }
        else if ((num2>num3) && (num3>num1)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros: "+num2+" - "+num3+" - "+num1);
        }
        else if ((num3>num1) && (num1>num2)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros: "+num3+" - "+num1+" - "+num2);
        }
        else if ((num3>num2) && (num2>num1)){
            JOptionPane.showMessageDialog(null, "El orden de los numeros: "+num3+" - "+num2+" - "+num1);
        }
    }
}
