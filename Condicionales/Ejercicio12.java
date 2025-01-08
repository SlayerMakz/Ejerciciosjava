package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio12 {
    /*
        Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones: 
        1.Ingresar dinero a la cuenta.
        2.Retirar dinero de la cuenta.
        3. Salir.
     */
    public static void main(String[] args) {
        char operacion;
        double monto, saldoInicial = 1000, saldoTotal;
        operacion = JOptionPane.showInputDialog("Digite la operación que quiere realizar: \n 1.- Ingresar dinero a la cuenta. \n 2.- Retirar dinero de la cuenta. \n 3.- Salir. ").charAt(0);
        switch (operacion){
            case '1':
            monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto: "));
            saldoTotal = saldoInicial + monto; 
            JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: "+saldoTotal);
                break;
            case '2':
            monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto: "));
            saldoTotal = saldoInicial - monto; 
            JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: "+saldoTotal);
                break;
            case '3':
            JOptionPane.showMessageDialog(null, "Gracias, vuelva pronto!.");
                break; 
            default: JOptionPane.showMessageDialog(null, "La operación no es valida. ");
                break; 
        }
    }
}
