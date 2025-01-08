package Condicionales;
import javax.swing.JOptionPane;
/*
    Pedir el día, mes y año de una fecha e indicar si es correcta, tomando en cuenta los días que tiene cada mes. 
 */
public class Ejercicio9recargado {
    public static void main(String[] args) {
        int dia, mes, año; 
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        if ((dia>0 && dia<=30) && ((mes==1)||(mes==3)||(mes==5)||(mes==8)||(mes==10)||(mes==12))&&(año!=0)){
            JOptionPane.showMessageDialog(null, "La fecha es correcta: "+dia+" / "+mes+" / "+año);
        }
        else if((dia>0 && dia<=28) && ((mes==2))){
            JOptionPane.showMessageDialog(null, "La fecha es correcta: "+dia+" / "+mes+" / "+año);            
        }
        else if((dia>0 && dia <=30) && ((mes==4)||(mes==6)||(mes==9)||(mes==11))){
            JOptionPane.showMessageDialog(null, "La fecha es correcta: "+dia+" / "+mes+" / "+año);            
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta: ");            
            
        }
    }
}
