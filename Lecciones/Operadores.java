import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9);  //Raíz cuadrada.
        double base = 5, exponente = 2; // Potencia de un número. 
        double resultado = Math.pow(base, exponente); // Potencia de un número.
        double numero = 4.56; 
        long resultado2 = Math.round(numero); // Para redondear un número. long para hacerlo a entero y float para hacerlo double
        double numero2 = Math.random(); // Para sacar un número aleatorio. 
        //BUSCAR METODOS DE LA CLASE MATH EN JAVA

        System.out.println(raiz);    
        System.out.println(resultado); 
        System.out.println(resultado2);
        System.out.println(numero2);
    }
}
