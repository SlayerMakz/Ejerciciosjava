import java.util.Scanner;
public class Ejercicio_3 {
    //Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
    //Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3. 
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float guillermo, luis, juan, total; 
        
        System.out.println("¿Cuánto dinero tiene Guillermo?");
        guillermo = entrada.nextFloat(); 
        luis = guillermo / 2; //Luis tiene la mitad de lo que posee guillermo
        juan = (guillermo + luis) / 2; //Juan tiene la mitad de lo que poseen guillermo y luis juntos. 
        total = (guillermo + luis + juan); //La suma de las 3 variables
        System.out.println("Los tres tienen en total: "+ total +" dolares.");
    }
}
