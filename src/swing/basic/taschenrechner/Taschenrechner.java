package swing.basic.taschenrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class Taschenrechner extends JFrame implements ActionListener {

    private final JTextField rechenArea;
    private String zahl1 = null;
    private String zahl2 = null;
    private String operator = null;
    private String error = null;
    private int rechnung;


    Taschenrechner(int width,int height){
        setSize(new Dimension(width,height));

        //JTextField mit Font art, Font Größe, Course nach rechts und in den Nördlichenteil des Fensters gesetzt
        rechenArea = new JTextField();
        rechenArea.setFont(new Font("", Font.PLAIN,20));
        rechenArea.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonArea = new JPanel();

        buttonArea.setLayout(new GridLayout(4,4));
        JButton btn0 = new JButton("0");
        btn0.addActionListener(this);
        btn0.setName("zero");
        JButton btn1 = new JButton("1");
        btn1.addActionListener(this);
        btn1.setName("one");
        JButton btn2 = new JButton("2");
        btn2.addActionListener(this);
        btn2.setName("two");
        JButton btn3 = new JButton("3");
        btn3.addActionListener(this);
        btn3.setName("three");
        JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        btn4.setName("four");
        JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        btn5.setName("five");
        JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        btn6.setName("six");
        JButton btn7 = new JButton("7");
        btn7.addActionListener(this);
        btn7.setName("seven");
        JButton btn8 = new JButton("8");
        btn8.addActionListener(this);
        btn8.setName("eight");
        JButton btn9 = new JButton("9");
        btn9.addActionListener(this);
        btn9.setName("nine");
        JButton btnMal = new JButton("*");
        btnMal.addActionListener(this);
        btnMal.setName("multiply");
        JButton btnGeteilt = new JButton("/");
        btnGeteilt.addActionListener(this);
        btnGeteilt.setName("divide");
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        btnPlus.setName("addition");
        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        btnMinus.setName("subtract");
        JButton btnGleich = new JButton("=");
        btnGleich.addActionListener(this);
        btnGleich.setName("equals");
        JButton btnDel = new JButton("<-");
        btnDel.addActionListener(this);
        btnDel.setName("delete");


        add(rechenArea, BorderLayout.NORTH);
        add(buttonArea);
        buttonArea.add(btn1);
        buttonArea.add(btn2);
        buttonArea.add(btn3);
        buttonArea.add(btnDel);
        buttonArea.add(btn4);
        buttonArea.add(btn5);
        buttonArea.add(btn6);
        buttonArea.add(btnPlus);
        buttonArea.add(btn7);
        buttonArea.add(btn8);
        buttonArea.add(btn9);
        buttonArea.add(btnMinus);
        buttonArea.add(btnGeteilt);
        buttonArea.add(btn0);
        buttonArea.add(btnMal);
        buttonArea.add(btnGleich);







        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();

        if(Pattern.matches("[\\d,]{1}",btn.getText())){
            rechenArea.setText(rechenArea.getText() + btn.getText());

        } else {
            switch (btn.getName()){
                case "delete":
                    try {
                        rechenArea.setText(rechenArea.getText().substring(0,rechenArea.getText().length()-1));
                    }catch (StringIndexOutOfBoundsException xx){
                        break;
                    }
                    break;
                case "equals":
                    zahl2 = rechenArea.getText();
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
                        rechenArea.setText(error);
                    }else {
                        rechenArea.setText(String.valueOf(rechnung));
                    }
                    error = null;
                    break;
                case "multiply":
                    zahl1 = rechenArea.getText();
                    rechenArea.setText("");
                    operator = "*";
                    break;
                case "divide":
                    zahl1 = rechenArea.getText();
                    rechenArea.setText("");
                    operator = "/";
                    break;
                case "addition":
                    zahl1 = rechenArea.getText();
                    rechenArea.setText("");
                    operator = "+";
                    break;
                case "subtract":
                    zahl1 = rechenArea.getText();
                    rechenArea.setText("");
                    operator = "-";
            }
        }

    }
}
