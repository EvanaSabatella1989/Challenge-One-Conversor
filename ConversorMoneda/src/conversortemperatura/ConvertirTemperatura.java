
package conversortemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
    
    public void convertirCelsiusAFahrenheit(double temperatura){
        double tempFahrenheit = ((temperatura * 1.8) + 32);
        JOptionPane.showMessageDialog(null, "Tienes " + tempFahrenheit + "°F.");
    }
    
    public void convertirCelsiusAKelvin(double temperatura){
        double tempKelvin = temperatura + 273.15;
        JOptionPane.showMessageDialog(null, "Tienes " + tempKelvin + "°K.");
    }
    
    public void convertirCelsiusARankine(double temperatura){
        double tempRankine = temperatura * 1.8 + 491.67;
        JOptionPane.showMessageDialog(null, "Tienes " + tempRankine + "°R.");
    }
    
    public void convertirFahrenheitACelsius(double temperatura){
        double tempCelsius = (temperatura - 32) * 0.56;
        JOptionPane.showMessageDialog(null, "Tienes " + tempCelsius + "°C.");
    }
    
    public void convertirFahrenheitAKelvin(double temperatura){
        double tempKelvin = (temperatura + 459.67) * 0.56;
        JOptionPane.showMessageDialog(null, "Tienes " + tempKelvin + "°K.");
    }
    
    public void convertirFahrenheitARankine(double temperatura){
        double tempRankine = temperatura + 459.67;
        JOptionPane.showMessageDialog(null, "Tienes " + tempRankine + "°R.");
    }
}
