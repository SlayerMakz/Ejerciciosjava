package Condicionales;
import javax.swing.JOptionPane;
/*
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días. 
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        if (dia <= 30  && mes <= 12 && año != 0){
            JOptionPane.showMessageDialog(null, "La fecha es correcta es: "+dia+" / "+mes+" / "+año);
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha no es correcta o aún no sucede.");
        }
    }
}
