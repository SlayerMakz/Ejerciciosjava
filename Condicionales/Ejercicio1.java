package Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio1{ 
    public static void main(String[] args) {
        char letra; 
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0); //Si es un caracter se agrega el .charAt, y el 0 es guardar la primera posicion de una cadena. 
        //Ahora hay que ver si la letra es mayuscula o no. 
        if (Character.isUpperCase(letra)){ //Character.isUpperCase es para definir si una letra es mayuscula o no. 
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula.");
        }
    }
}