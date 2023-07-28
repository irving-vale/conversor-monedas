import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConvertToDollar implements Iconverter {

    private double value;

    private static final Map <String,Double> valorDolar = new HashMap<>();

    static {
        valorDolar.put("De Pesos Mexicanos a Dolar", 17.15);
        valorDolar.put("De Pesos Colombianos a Dolar",4195.73);
        valorDolar.put("De Soles Peruanos a Dolar",3.64);
        valorDolar.put("De Euros a Dolar",0.91);
        valorDolar.put("De Libras Esterlinas a Dolar",0.78);
        valorDolar.put("De Won sur coreano a Dolar",1286.65);
    }

    public ConvertToDollar(double value) {
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
                valorDolar.keySet().toArray(new String[0]), valorDolar);
            double choiceGetValor = valorDolar.get(choice);
            double result = value/ choiceGetValor;
            result = Math.round(result * 1000.0)/ 1000.0;
            JOptionPane.showMessageDialog(null,"Tienes $" + result + "Dolares");
            System.out.println(choiceGetValor);

    }

}


