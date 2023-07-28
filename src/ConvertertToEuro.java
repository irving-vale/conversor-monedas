import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConvertertToEuro implements Iconverter{

    private double value;
    private static final Map<String,Double> valorEuro = new HashMap<>();

    static {
        valorEuro.put("Dolar a Euro", 0.91);
        valorEuro.put("Pesos Colombianos a Euro",0.00023);
        valorEuro.put("Soles Peruanos a Euro",0.25);
        valorEuro.put("Pesos mexicanos a Euro",0.054);
        valorEuro.put("Libras Esterlinas a Euro",1.17);
        valorEuro.put("Won sur coreano a Euro",0.00071);
    }

    public ConvertertToEuro(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void calculaConversion() {
        String choice = (String) JOptionPane.showInputDialog(null,"seleccion","seleccion"
                ,JOptionPane.PLAIN_MESSAGE, null,
                valorEuro.keySet().toArray(new String[0]), valorEuro);
        double choiceGetValor = valorEuro.get(choice);
        double result = value * choiceGetValor;
        result = Math.round(result * 1000.0)/ 1000.0;
        JOptionPane.showMessageDialog(null,"Tienes $" + result + " " +"Euros");
        System.out.println(choiceGetValor);
    }
}
