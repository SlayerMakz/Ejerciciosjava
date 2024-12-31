import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, num1, num2, exponente = 2;
        double resultado;   
        System.out.println("Asígna un número a: ");
        num1 = entrada.nextInt();
        System.out.println("Asigna un número b: ");
        num2 = entrada.nextInt(); 
        a = Math.pow(num1, exponente);
        b = Math.pow(num2, exponente); 
        resultado = a + 2*(num1)*(num2) + b; 
        System.out.println("El resultado de la suma de 2 cuadrados es: "+resultado);
    }
}
