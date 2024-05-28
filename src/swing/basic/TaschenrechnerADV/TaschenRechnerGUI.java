package swing.basic.TaschenrechnerADV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.regex.Pattern;


public class TaschenRechnerGUI extends JFrame {
    protected JLabel rechenweg;
    protected JButton negpo;
    protected JButton one;
    protected JButton four;
    protected JButton seven;
    protected JButton onedivde;
    protected JButton precentage;
    protected JButton clearEntry;
    protected JButton clearall;
    protected JButton delete;
    protected JButton root;
    protected JButton divide;
    protected JButton eight;
    protected JButton nine;
    protected JButton multiply;
    protected JButton five;
    protected JButton six;
    protected JButton substract;
    protected JButton two;
    protected JButton three;
    protected JButton addition;
    protected JButton zero;
    protected JButton comma;
    protected JButton equals;
    protected JButton exponantial;
    protected JPanel mainPanel;
    protected JLabel eingabe;
    protected String zahl1 = null;
    protected String zahl2 = null;
    protected String operator = null;
    protected String error = null;
    protected double rechnung;

    DecimalFormat df = new DecimalFormat("0.00");




    public TaschenRechnerGUI() {

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton)e.getSource();
                if(rechenweg.getText().contains("=")){
                    rechenweg.setText("");
                    eingabe.setText("");
                }
                System.out.println(btn.getName());
                if(btn.getName().equals("comma")) {
                    eingabe.setText(eingabe.getText() + ".");
                } else if (Pattern.matches("[\\d,]{1}", btn.getText())) {
                    eingabe.setText(eingabe.getText() + btn.getText());
            } else {
                        switch (btn.getName()) {
                            case "delete":
                                try {
                                    eingabe.setText(eingabe.getText().substring(0, eingabe.getText().length() - 1));
                                } catch (StringIndexOutOfBoundsException xx) {
                                    break;
                                }
                                break;

                            case "equals":
                                zahl2 = eingabe.getText();
                                switch (operator) {
                                    case "+":
                                        rechnung = Float.parseFloat(zahl1) + Float.parseFloat(zahl2);
                                        break;
                                    case "-":
                                        rechnung = Float.parseFloat(zahl1) - Float.parseFloat(zahl2);
                                        break;
                                    case "*":
                                        rechnung = Float.parseFloat(zahl1) * Float.parseFloat(zahl2);
                                        break;
                                    case "/":
                                        try {
                                            rechnung = Float.parseFloat(zahl1) / Float.parseFloat(zahl2);
                                        } catch (ArithmeticException x) {
                                            error = "error";
                                        }
                                        break;
                                }
                                if (error != null) {
                                    eingabe.setText(error);
                                } else {
                                    eingabe.setText(String.valueOf(df.format(rechnung)));
                                }
                                rechenweg.setText(rechenweg.getText() + zahl2 + "=" + df.format(rechnung));
                                error = null;
                                break;

                            case "multiply":
                                zahl1 = eingabe.getText();
                                eingabe.setText("");
                                operator = "*";
                                rechenweg.setText(rechenweg.getText() + zahl1 + operator);
                                break;

                            case "precentage" :
                                rechnung = (Float.parseFloat(zahl1) / 100) * Float.parseFloat(eingabe.getText());
                                eingabe.setText(String.valueOf(df.format(rechnung).replace(",",".")));
                                break;

                            case "onedivde":
                                zahl1 = eingabe.getText();
                                eingabe.setText("");
                                operator = "1/x";
                                rechnung = 1 / Float.parseFloat(zahl1);
                                rechenweg.setText("1" + "/" + zahl1 + "=" + df.format(rechnung));
                                eingabe.setText(String.valueOf(df.format(rechnung)));
                                error = null;
                                break;

                            case "root":
                                zahl1 = eingabe.getText();
                                operator = "√";
                                rechnung = Math.sqrt(Float.parseFloat(zahl1));
                                rechenweg.setText(  operator + "("+zahl1+")" + "=" + df.format(rechnung));
                                eingabe.setText(String.valueOf(df.format(rechnung)));
                                error = null;
                                break;

                            case "exponantial":
                                zahl1 = eingabe.getText();
                                operator = "^2";
                                rechnung = Float.parseFloat(zahl1) * Float.parseFloat(zahl1);
                                rechenweg.setText( zahl1 + operator + "=" + df.format(rechnung));
                                eingabe.setText(String.valueOf(df.format(rechnung)));
                                error = null;
                                break;

                            case "negpo":
                                if (eingabe.getText().contains("-")){
                                    eingabe.setText(eingabe.getText().replace("-",""));
                                }else {
                                    eingabe.setText("-"+eingabe.getText());
                                }
                                break;

                            case "divide":
                                zahl1 = eingabe.getText();
                                eingabe.setText("");
                                operator = "/";
                                rechenweg.setText(rechenweg.getText() + zahl1 + operator);
                                break;

                            case "addition":
                                zahl1 = eingabe.getText();
                                eingabe.setText("");
                                operator = "+";
                                rechenweg.setText(rechenweg.getText() + zahl1 + operator);
                                break;

                            case "substract":
                                zahl1 = eingabe.getText();
                                eingabe.setText("");
                                operator = "-";
                                rechenweg.setText(rechenweg.getText() + zahl1 + operator);
                                break;

                            case "clearEntry":
                                eingabe.setText("");
                                break;

                            case "clearall":
                                eingabe.setText("");
                                rechenweg.setText("");
                                operator = null;
                                zahl1 = null;
                                zahl2 = null;
                        }
                    }


            }
        };
        clearEntry.addActionListener(listener);
        precentage.addActionListener(listener);
        clearall.addActionListener(listener);
        onedivde.addActionListener(listener);
        exponantial.addActionListener(listener);
        root.addActionListener(listener);
        seven.addActionListener(listener);
        eight.addActionListener(listener);
        nine.addActionListener(listener);
        four.addActionListener(listener);
        five.addActionListener(listener);
        six.addActionListener(listener);
        one.addActionListener(listener);
        two.addActionListener(listener);
        three.addActionListener(listener);
        zero.addActionListener(listener);
        negpo.addActionListener(listener);
        comma.addActionListener(listener);
        divide.addActionListener(listener);
        multiply.addActionListener(listener);
        substract.addActionListener(listener);
        addition.addActionListener(listener);
        equals.addActionListener(listener);
        delete.addActionListener(listener);
    }

}
