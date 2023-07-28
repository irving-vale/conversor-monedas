import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    private static Iconverter strategy;
    private static final List<String> conversionOption = new ArrayList<>();
private static final    List<String> money = new ArrayList<>();
    private static final Converter converter = new Converter();


    static {
        conversionOption.add("Monedas");
        conversionOption.add("Temperatura");
        money.add("A Dolar");
        money.add("A Peso Mexicano");
        money.add("A Euro");
    }


    public static void main(String[] args) {

        while (!converter.isEnd()) {

            String op = (String) JOptionPane.showInputDialog(null, "seleccione", "seleccion",
                    JOptionPane.PLAIN_MESSAGE, null,
                    conversionOption.toArray(new String[0]), conversionOption);

            try {
                switch (op) {
                    case "Monedas" -> {
                        boolean keepGoing = false;
                        do {
                            try {

                                String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                                double receivedValue = Double.parseDouble(input);
                                String inputM = (String) JOptionPane.showInputDialog(null,"Seleccione a que moneda " +
                                                "quiere cambiar" +
                                                " ?","seleccione",
                                        JOptionPane.PLAIN_MESSAGE,null,money.toArray(new String[0]),money);
                                switch (inputM){
                                    case "A Dolar" ->{
                                        strategy = new ConvertToDollar(receivedValue);
                                    }
                                    case "A Peso Mexicano" ->{
                                        strategy = new ConvertToPesoMx(receivedValue);
                                    }
                                    case "A Euro" ->{
                                        strategy = new ConvertertToEuro(receivedValue);
                                    }
                                }

                            } catch (NumberFormatException n) {
                                JOptionPane.showMessageDialog(null, "Debe ingresar obligatoriamente un numero");
                                keepGoing = true;
                            } catch (NullPointerException nu) {
                                keepGoing = false;

                            }
                        } while (keepGoing);
                        try {
                            converter.processConver(strategy);
                        } catch (NullPointerException ignored) {

                        }
                        int option = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
                        if (JOptionPane.OK_OPTION == option) {
                            converter.isEnd();
                        } else {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa");
                            converter.setEnd();
                        }
                    }

                    // conversor temperatura
                    case "Temperatura" -> {
                        boolean keepGoing2 = false;
                        do {
                            try {
                                String input2 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                                double receivedValue2 = Double.parseDouble(input2);
                                strategy = new Temperatura(receivedValue2);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Debe ingresar obligatoriamente un numero");
                                keepGoing2 = true;
                            } catch (NullPointerException e) {
                                keepGoing2 = false;
                            }
                        } while (keepGoing2);

                        try {
                            converter.processConver(strategy);
                        } catch (NullPointerException ignored) {
                        }
                        int option2 = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
                        if (JOptionPane.OK_OPTION == option2) {
                            converter.isEnd();
                        } else {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa");
                            converter.setEnd();
                        }
                    }
                }
            } catch (NullPointerException e) {
                converter.setEnd();
            }


        }


    }

}

