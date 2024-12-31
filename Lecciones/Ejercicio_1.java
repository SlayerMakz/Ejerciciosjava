import java.util.Scanner;
public class Ejercicio_1 {
    //HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE TRES CALIFICACIONES.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3; 
        float resultado; 
    
        //Primero guardamos las 3 notas
        System.out.println("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat(); 
        //Ahora sumamos las variables e imprimimos el resultado
        resultado = nota1 + nota2 + nota3; //Sumamos las 3 notas. 
        System.out.println("El resultado es igual a: "+resultado);

    }
}
