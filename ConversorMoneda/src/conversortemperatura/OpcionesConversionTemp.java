
package conversortemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemp {
    
    ConvertirTemperatura temperatura = new ConvertirTemperatura();
        
    public void convertirTemperatura(double temp){
        String opcion = (JOptionPane.showInputDialog(null, "Elije la escala a la que "
            + "deseas convertir tu temperatura","Temperaturas",
            JOptionPane.PLAIN_MESSAGE, null, new Object[]
            {"De Celsius a Fahrenheit","De Celsius a Kelvin", "De Celsius a Rankine","De Fahrenheit a Celsius","De Fahrenheit a Kelvin","De Fahrenheit a Rankine"},
            "Seleccion")).toString();
        switch(opcion){
            case "De Celsius a Fahrenheit":
                temperatura.convertirCelsiusAFahrenheit(temp);
                break;
            case "De Celsius a Kelvin":
                temperatura.convertirCelsiusAKelvin(temp);
                break;
            case "De Celsius a Rankine":
                temperatura.convertirCelsiusARankine(temp);
                break;
            case "De Fahrenheit a Celsius":
                temperatura.convertirFahrenheitACelsius(temp);
                break;
            case "De Fahrenheit a Kelvin":
                temperatura.convertirFahrenheitAKelvin(temp);
                break;
            case "De Fahrenheit a Rankine":
                temperatura.convertirFahrenheitARankine(temp);
                break;
        }
        
    }
}
