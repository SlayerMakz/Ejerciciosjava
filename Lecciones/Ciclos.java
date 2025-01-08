package Lecciones;

public class Ciclos {
    /* Ciclo while. */
    /* while (condicion){
        Instruccion;     
    } 
    */
    /* Hacer un programa que imprima los numeros del 1 al 10 */
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }   
        while (i>=1){
            System.out.println(i);
            i--;
        }
    }
}
