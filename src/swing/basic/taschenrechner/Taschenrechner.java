package swing.basic.taschenrechner;

import javax.swing.*;
import java.awt.*;

public class Taschenrechner extends JFrame {

    Taschenrechner(int width,int height){
        setSize(new Dimension(width,height));

        //JTextField mit Font art, Font Größe, Course nach rechts und in den Nördlichenteil des Fensters gesetzt
        JTextField rechenArea = new JTextField();
        rechenArea.setFont(new Font("", Font.PLAIN,20));
        rechenArea.setHorizontalAlignment(JTextField.RIGHT);
        add(rechenArea, BorderLayout.NORTH);

        JPanel buttonArea = new JPanel();
        buttonArea.setLayout(new GridLayout(4,4));



        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnMal = new JButton("*");
        JButton btnGeteilt = new JButton("/");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnGleich = new JButton("=");
        JButton btnDel = new JButton("<-");




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }}
