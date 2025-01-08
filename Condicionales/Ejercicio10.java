package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio10 {
    /*
        Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto, y division) con valores numéricos enteros. El usuario debe especificiar la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P o p, M o m para el producto y D o d para la división. 
     */
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
