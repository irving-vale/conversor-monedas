import javax.swing.*;
import java.util.Map;

public class Temperatura implements Iconverter {

    private double value;

    public Temperatura(double value) {
        this.value = value;
    }



    @Override
    public void calculaConversion() {
        Object [] op = {"convertir de ºC a ºF","convertir de ºF a ºC","convertir de K a ºC","convertir de ºC a K",
                "convertir de ºF a K","convertir de K a ºF"};
        String opciones = (String) JOptionPane.showInputDialog(null, "Escoge el Tipo de Conversion","seleccion",
                JOptionPane.PLAIN_MESSAGE,null,op,op[0]);
        switch (opciones){
            case "convertir de ºC a ºF":
                double f = (value * 9/5) + 32;
                JOptionPane.showMessageDialog(null,"grados ="+ f +"ºF");
                break;

            case "convertir de ºF a ºC":
                double cen = (value - 32) * 5/9 ;//(ºF-32) * 5/9.
                JOptionPane.showMessageDialog(null,"grados ="+ cen +"ºF");
                break;
            case "convertir de K a ºC":
                double c = value - 273.15 ;//K – 273.15
                JOptionPane.showMessageDialog(null,"grados ="+ c +"ºF");
                break;
            case "convertir de ºC a K":
                double k = value + 273.15 ;//ºC + 273.15
                JOptionPane.showMessageDialog(null,"grados ="+ k +"ºF");
                break;
            case "convertir de ºF a K":
                double ke = (value - 32) * 5/9 + 273.15; //5/9 * (ºF – 32) + 273.15.
                JOptionPane.showMessageDialog(null,"grados ="+ ke +"ºF");
                break;
            case "convertir de K a ºF":
                double fe = (value - 273.15) * 9/5 + 32 ; // (k - 273.15) * 9/5
                JOptionPane.showMessageDialog(null,"grados ="+ fe +"ºF");
                break;

        }

    }
}
