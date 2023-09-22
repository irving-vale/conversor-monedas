import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public  class Money implements Iconverter{

    protected  double value;
    protected   Map<String,Double> valueMoney = new HashMap<>();

    public Money(double value) {
        this.value = value;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void calculaConversion() {
        String choice = (String) JOptionPane.showInputDialog(null,"seleccion","seleccion"
                ,JOptionPane.PLAIN_MESSAGE, null,
                valueMoney.keySet().toArray(new String[0]), valueMoney);
        double choiceGetValor = valueMoney.get(choice);
        double result = getValue() * choiceGetValor;
        result = Math.round(result * 1000.0)/ 1000.0;
        JOptionPane.showMessageDialog(null,"Tienes $" + result + " " + choice);
        System.out.println(choiceGetValor);

    }


}
