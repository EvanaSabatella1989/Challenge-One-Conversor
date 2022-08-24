
package conversormoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
    
    public void ConvertirPesosArgentinosADolares(double valor){
        double monedaDolar = valor / 137.13;
        monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "dolares.");
    }
    
    public void ConvertirPesosArgentinosAEuros(double valor){
        double monedaDolar = valor / 136.73;
        monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "dolares.");
    }
    
    public void ConvertirPesosArgentinosALibrasEsterlinas(double valor){
        double monedaDolar = valor / 161.83;
        monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "dolares.");
    }
    
    public void ConvertirPesosArgentinosAYenes(double valor){
        double monedaDolar = valor / 1.00;
        monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "dolares.");
    }
    
    public void ConvertirPesosArgentinosAWones(double valor){
        double monedaDolar = valor / 0.10;
        monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "dolares.");
    }
    
    
}
