package Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double precioOrig, precioDesc, descuento = 0.20, total; 
        precioOrig = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la compra: "));
        if (precioOrig > 300){
            precioDesc = (precioOrig * descuento);
            total = (precioOrig - precioDesc); 
            JOptionPane.showMessageDialog(null, "El precio total es: "+total);
        }
        else {
            JOptionPane.showMessageDialog(null, "El precio total sin descuento es: "+precioOrig);
        }
    }
}
