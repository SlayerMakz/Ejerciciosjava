package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        int num1, num2, resultado; 
        char operacion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo numero: "));
        operacion = JOptionPane.showInputDialog("Digite \n S = Suma \n R = Resta \n M = Multiplicacion \n P = Producto \n D = división").charAt(0);
        switch (operacion) {
            case 's':
            case 'S':
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+resultado);   
                break;
            case 'r':
            case 'R':
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resultado);
                break; 
            case 'm':
            case 'M':
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+resultado); 
                break;
            case 'p':
            case 'P':
                resultado = num1 % num2; 
                JOptionPane.showMessageDialog(null, "El resultado del producto es: "+resultado);
                break; 
            case 'd':
            case 'D':
                resultado = num1 / num2; 
                JOptionPane.showMessageDialog(null, "El resultado de la división es: "+resultado);
                break;  
            default:
                JOptionPane.showMessageDialog(null, "La operación no es valida: ");
                break;
        }
    }
}
