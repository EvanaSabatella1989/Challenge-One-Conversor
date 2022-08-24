
package Principal;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        
        while (true) {
            String opciones = JOptionPane.showInputDialog(null,"Seleccione una "
                    + "opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elegir").toString();
        }
        
    }
    
}
