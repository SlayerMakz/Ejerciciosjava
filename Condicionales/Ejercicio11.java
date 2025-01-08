package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio11 {
    /*
        Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente. 
     */
    public static void main(String[] args) {
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota: "));
        switch (numero){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, "La nota es deficiente: "+numero);
                break; 
            case 6:
                JOptionPane.showMessageDialog(null, "La nota es suficiente: "+numero);
                break;
            case 7: 
                JOptionPane.showMessageDialog(null, "La nota está bien: "+numero);
                break;
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "La nota es notable: "+numero);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "La nota es sobresaliente: "+numero);
                break;
            default:
                JOptionPane.showMessageDialog(null, "La nota no es valida.");
                break;
        }
    }
}
