package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
      int horasTrabajadas; 
      float salarioTotal;
      horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: ")); 
      
      if(horasTrabajadas <= 40){
        salarioTotal = horasTrabajadas * 16; 
      }
      else{
        salarioTotal = (40 * 16) + ((horasTrabajadas-40) * 20); 
      }
      JOptionPane.showMessageDialog(null, "El salario totales: " +salarioTotal);
    }
}
