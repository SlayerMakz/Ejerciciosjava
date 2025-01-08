package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio13 {
  /*
    Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
     */  
    public static void main(String[] args) {
        char operacion; 
        double masaInicial, masaTotal;
        operacion = JOptionPane.showInputDialog("Digite la unidad que quiera convertir: \n 1.- gr \n 2.- mg \n 3.- lb \n 4.- oz ").charAt(0); 
        switch (operacion){
            case '1':
            masaInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor: ")); 
            masaTotal = masaInicial * 1000;
            JOptionPane.showMessageDialog(null, "La masa total de kg a gr es: "+masaTotal);
                break;
            case '2': 
            masaInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor: "));
            masaTotal = masaInicial * 1000000;
            JOptionPane.showMessageDialog(null, "La masa total de kg a mg es: "+masaTotal);
            case '3': 
            masaInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor: ")); 
            masaTotal = masaInicial * 2.205; 
            JOptionPane.showMessageDialog(null, "La masa total de kg a lb es: "+masaTotal);
                break;
            default: 
                JOptionPane.showMessageDialog(null, "La opción no es valida.");
        }
    }
}
