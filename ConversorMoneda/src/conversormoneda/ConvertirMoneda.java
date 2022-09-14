
package conversormoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
    
    public void ConvertirPesosArgentinosADolares(double valor){
        double monedaDolar = valor / 142.28;
        monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares.");
    }
    
    public void ConvertirPesosArgentinosAEuros(double valor){
        double monedaEuro = valor / 144.20;
        monedaEuro = (double)Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros.");
    }
    
    public void ConvertirPesosArgentinosALibrasEsterlinas(double valor){
        double monedaLibra = valor / 166.44;
        monedaLibra = (double)Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas.");
    }
    
    public void ConvertirPesosArgentinosAYenes(double valor){
        double monedaYen = valor / 1.00;
        monedaYen = (double)Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes.");
    }
    
    public void ConvertirPesosArgentinosAWones(double valor){
        double monedaWon = valor / 0.10;
        monedaWon = (double)Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wones Coreanos.");
    }
    
    public void ConvertirDolaresAPesosArgentinos(double valor){
        double monedaPeso = valor * 142.28;
        monedaPeso = (double)Math.round(monedaPeso * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos.");
    }
    
    public void ConvertirEurosAPesosArgentinos(double valor){
        double monedaPeso = valor * 144.20;
        monedaPeso = (double)Math.round(monedaPeso * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos.");
    }
    
    public void ConvertirLibrasEsterlinasAPesosArgentinos(double valor){
        double monedaPeso = valor * 166.44;
        monedaPeso = (double)Math.round(monedaPeso * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos.");
    }
    
    public void ConvertirYenesAPesosArgentinos(double valor){
        double monedaPeso = valor * 1.00;
        monedaPeso = (double)Math.round(monedaPeso * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos.");
    }
    
    public void ConvertirWonesAPesosArgentinos(double valor){
        double monedaPeso = valor * 0.10;
        monedaPeso = (double)Math.round(monedaPeso * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos.");
    }
    
    
}
