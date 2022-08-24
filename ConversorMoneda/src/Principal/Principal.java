
package Principal;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        
        while (true) {
            String opciones = JOptionPane.showInputDialog(null,"Seleccione una "
                    + "opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
            switch (opciones) {
                case "Conversor de Monedas":
                    System.out.println("Conversor de Monedas");
                    //break;
                default:
                    throw new AssertionError();
            }
        
        }
        
    }
    
}
