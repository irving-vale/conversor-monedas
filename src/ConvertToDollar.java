import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConvertToDollar extends Money {



    private static final Map <String,Double> valorDolar = new HashMap<>();

    static {
        valorDolar.put("Pesos Mexicanos a Dolar", 0.059);
        valorDolar.put("Pesos Colombianos a Dolar",0.00025);
        valorDolar.put("Soles Peruanos a Dolar",0.27);
        valorDolar.put("Euros a Dolar",1.10);
        valorDolar.put("Libras Esterlinas a Dolar",1.28);
        valorDolar.put("Won sur coreano a Dolar",0.00078);
    }

    public ConvertToDollar(double value) {
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
        String choice = (String) JOptionPane.showInputDialog(null,"seleccion","seleccion"
                ,JOptionPane.PLAIN_MESSAGE, null,
                valorDolar.keySet().toArray(new String[0]), valorDolar);
            double choiceGetValor = valorDolar.get(choice);
            double result = value * choiceGetValor;
            result = Math.round(result * 1000.0)/ 1000.0;
            JOptionPane.showMessageDialog(null,"Tienes $" + result + " " + "Dolares");
            System.out.println(choiceGetValor);

    }

}


