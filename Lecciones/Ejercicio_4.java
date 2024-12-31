import java.util.Scanner; 
public class Ejercicio_4 {
    //Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, más una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprimar el salario mensual de un vendedor dado. 
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int salario = 1000, valorcarro, carros, comision1, comision2, salariototal; 

        System.out.println("¿Cuantos carros vendió?");
        carros = entrada.nextInt();

        System.out.println("\n¿Cuál es el valor del auto");
        valorcarro = entrada.nextInt();

        comision1 = (150 * carros); 
        comision2 = (valorcarro * carros) * 5 / 100;
        salariototal = comision1 + comision2 + salario; 
        System.out.println("\nEl salario total del vendedor es de: "+ salariototal +" dólares.");

    }
}
