
package Principal;

import conversormoneda.OpcionesConversion;
import conversortemperatura.OpcionesConversionTemp;
import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        
        OpcionesConversion conversion = new OpcionesConversion();
        OpcionesConversionTemp conversionTemp = new OpcionesConversionTemp();
        int respuesta = 0;
        while (respuesta == 0) {
            String opciones = JOptionPane.showInputDialog(null,"Seleccione una "
                    + "opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
            switch (opciones) {
                case "Conversor de Monedas":
                    String input = JOptionPane.showInputDialog(null,"Ingrese un valor");
                    double valorRecibido = Double.parseDouble(input);
                    conversion.ConvertirMonedas(valorRecibido);
                    
                    respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
                    if(JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciones opcion afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                        respuesta = 1;
                    }
                    break;
                case "Conversor de Temperatura":
                    String inputTemp = JOptionPane.showInputDialog(null, "Ingrese una temperatura");
                    double tempRecibida = Double.parseDouble(inputTemp);
                    conversionTemp.convertirTemperatura(tempRecibida);
                    
                    respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
                    if(JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Seleccione opcion afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                        respuesta = 1;
                    }
                    break;
                    
                    
                    
            }
        
        }
        
    }
    
}
