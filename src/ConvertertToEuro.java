import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConvertertToEuro extends Money {



    private static final Map<String,Double> valueMoney = new HashMap<>();

    static {
        valueMoney.put("Dolar a Euro", 0.91);
        valueMoney.put("Pesos Colombianos a Euro",0.00023);
        valueMoney.put("Soles Peruanos a Euro",0.25);
        valueMoney.put("Pesos mexicanos a Euro",0.054);
        valueMoney.put("Libras Esterlinas a Euro",1.17);
        valueMoney.put("Won sur coreano a Euro",0.00071);
    }

    public ConvertertToEuro(double value) {
        super(value);

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void calculaConversion() {
        super.calculaConversion();
    }



/*@Override
    public void calculaConversion() {

        String choice = (String) JOptionPane.showInputDialog(null,"seleccion","seleccion"
                ,JOptionPane.PLAIN_MESSAGE, null,
                valorEuro.keySet().toArray(new String[0]), valorEuro);
        double choiceGetValor = valorEuro.get(choice);
        double result = value * choiceGetValor;
        result = Math.round(result * 1000.0)/ 1000.0;
        JOptionPane.showMessageDialog(null,"Tienes $" + result + " " +"Euros");
        System.out.println(choiceGetValor);
    }*/
}
