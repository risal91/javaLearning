package swing.basic.TaschenrechnerADV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    protected int rechnung;



    public TaschenRechnerGUI() {


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton)e.getSource();
                if(rechenweg.getText().contains("=")){
                    rechenweg.setText("");
                    eingabe.setText("");
                }
                if(Pattern.matches("[\\d,]{1}",btn.getText())){
                    eingabe.setText(eingabe.getText() + btn.getText());

                } else {
                    switch (btn.getName()){
                        case "delete":
                            try {
                                eingabe.setText(eingabe.getText().substring(0,eingabe.getText().length()-1));
                            }catch (StringIndexOutOfBoundsException xx){
                                break;
                            }
                            break;
                        case "equals":
                            zahl2 = eingabe.getText();
                            switch (operator){
                                case "+":
                                    rechnung = Integer.parseInt(zahl1) + Integer.parseInt(zahl2);
                                    break;
                                case  "-":
                                    rechnung = Integer.parseInt(zahl1) - Integer.parseInt(zahl2);
                                    break;
                                case  "*":
                                    rechnung = Integer.parseInt(zahl1) * Integer.parseInt(zahl2);
                                    break;
                                case  "/":
                                    try{
                                        rechnung = Integer.parseInt(zahl1) / Integer.parseInt(zahl2);
                                    }catch (ArithmeticException x){
                                        error = "error";
                                    }
                                    break;
                            }
                            if(error != null){
                                eingabe.setText(error);
                            }else {
                                eingabe.setText(String.valueOf(rechnung));
                            }
                            rechenweg.setText(rechenweg.getText() + zahl2 + "=" + rechnung);
                            error = null;
                            break;
                        case "multiply":
                            zahl1 = eingabe.getText();
                            eingabe.setText("");
                            operator = "*";
                            rechenweg.setText(rechenweg.getText() + zahl1 + operator);
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
                        case "subtract":
                            zahl1 = eingabe.getText();
                            eingabe.setText("");
                            operator = "-";
                            rechenweg.setText(rechenweg.getText() + zahl1 + operator);
                            break;
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
