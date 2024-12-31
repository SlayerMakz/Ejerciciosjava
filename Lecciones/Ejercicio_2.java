import java.util.Scanner;
public class Ejercicio_2 {
    // Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de sus salario. 
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int horas;
        float sueldo, salario; 

        System.out.println("¿Cuántas horas trabaja a la semana?");
        horas = entrada.nextInt(); 
        System.out.println("\n ¿Cuánto gana por hora?");
        sueldo = entrada.nextFloat(); 

        salario = horas * sueldo;
        System.out.println("Usted gana por semana: "+salario); 
    }
}
