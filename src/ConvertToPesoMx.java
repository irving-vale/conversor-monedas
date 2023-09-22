import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConvertToPesoMx extends ConvertToDollar implements Iconverter{

    private double value;
    private static final Map<String,Double> valorPesoMx = new HashMap<>();

    static {
        valorPesoMx.put("Dolar a Peso Mexicano", 16.88);
        valorPesoMx.put("Pesos Colombianos a Peso Mexicano",0.0042);
        valorPesoMx.put("Soles Peruanos a Peso Mexicano",4.62);
        valorPesoMx.put("Euros a Peso Mexicano",18.48);
        valorPesoMx.put("Libras Esterlinas a Peso Mexicano",21.60);
        valorPesoMx.put("Won sur coreano a Peso Mexicano",0.013);
    }

    public ConvertToPesoMx(double value) {
        super(value);
    }

    /*public ConvertToPesoMx(double value) {
        this.value = value;
    }*/

    public double getValue() {
        return value;
    }


    @Override
    public void calculaConversion() {
        var choice = (String) JOptionPane.showInputDialog(null,"seleccion","seleccion"
                ,JOptionPane.PLAIN_MESSAGE, null,
                valorPesoMx.keySet().toArray(new String[0]), valorPesoMx);
        double choiceGetValor = valorPesoMx.get(choice);
        double result = getValue() * choiceGetValor;
        result = Math.round(result * 1000.0)/ 1000.0;
        JOptionPane.showMessageDialog(null,"Tienes $" + result +" " + "Pesos Mexicanos");
        System.out.println(choiceGetValor);
    }
}
