package swing.basic.TaschenrechnerADV;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        TaschenRechnerGUI taschenrechner = new TaschenRechnerGUI();
        taschenrechner.setContentPane(taschenrechner.mainPanel);
        taschenrechner.setTitle("Taschenrechner");
        taschenrechner.setSize(300,400);
        taschenrechner.setVisible(true);
        taschenrechner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
