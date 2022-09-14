
package conversormoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {
    ConvertirMoneda moneda = new ConvertirMoneda();
    
    public void ConvertirMonedas(double valor){
        String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que "
            + "deseas convertir tu dinero","Monedas",
            JOptionPane.PLAIN_MESSAGE, null, new Object[]
            {"De Pesos a Dolar","De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dolar a Pesos","De Euro a "
                    + "Pesos","De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
            "Seleccion")).toString();
        switch (opcion) {
            case "De Pesos a Dolar": 
                moneda.ConvertirPesosArgentinosADolares(valor);
                break;
            case "De Pesos a Euro":
                moneda.ConvertirPesosArgentinosAEuros(valor);
                break;
            case "De Pesos a Libras":
                moneda.ConvertirPesosArgentinosALibrasEsterlinas(valor);
                break;
            case "De Pesos a Yen":
                moneda.ConvertirPesosArgentinosAYenes(valor);
                break;
            case "De Pesos a Won Coreano":
                moneda.ConvertirPesosArgentinosAWones(valor);
                break;
            case "De Dolar a Pesos":
                moneda.ConvertirDolaresAPesosArgentinos(valor);
                break;
            case "De Euro a Pesos":
                moneda.ConvertirEurosAPesosArgentinos(valor);
                break;
            case "De Libras a Pesos":
                moneda.ConvertirLibrasEsterlinasAPesosArgentinos(valor);
                break;
            case "De Yen a Pesos":
                moneda.ConvertirYenesAPesosArgentinos(valor);
                break;
            case "De Won Coreano a Pesos":
                moneda.ConvertirWonesAPesosArgentinos(valor);
                break;
//            default:
//                throw new AssertionError();
        }
    }
    
}
