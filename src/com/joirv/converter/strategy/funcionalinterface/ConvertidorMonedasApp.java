package com.joirv.converter.strategy.funcionalinterface;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ConvertidorMonedasApp {
    public static void main(String[] args) {
        Map<String, StrategyConverter> estrategias = new HashMap<>();
        estrategias.put("Dolares a Euros", (cantidad) -> cantidad * 0.83);
        estrategias.put("Dolares a Pesos Mexicanos", (cantidad) -> cantidad * 20);
        estrategias.put("Dolares a pesos colombianos", (cantidad) -> cantidad / 4117.4976);
        estrategias.put("Dolares a cubanos ", (cantidad) -> cantidad / 4117.4976);

        while (true){
            String op = (String) JOptionPane.showInputDialog(null, "Selecciona una estrategia de conversión", "Selección",
                    JOptionPane.PLAIN_MESSAGE, null, estrategias.keySet().toArray(new String[0]), null);
            StrategyConverter choiceGetValor = estrategias.get(op);
            String input = JOptionPane.showInputDialog(null, "Ingrese el valor en dólares a convertir");
            double receivedValue = Double.parseDouble(input);
            double resultado = choiceGetValor.calculaConversion(receivedValue);

            JOptionPane.showMessageDialog(null, "Tienes " + resultado + " en la moneda seleccionada.");
            break;
         }
        }

}
