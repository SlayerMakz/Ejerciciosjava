public class Estructuraswitch {
    public static void main(String[] args) {
        char nota = '8';

        switch (nota) {
            case '5':
                System.out.println("Suficiente");
                break;
            case '6':
                System.out.println("Bien");
                break; 
            case '7':
                System.out.println("Notable");
                break; 
            case '8':
                System.out.println("Notable +");
                break; 
            case '9': 
                System.out.println("Sobresaliente");
        
            default:
                System.out.println("Reprobado");
                break;
        }
    }
}
