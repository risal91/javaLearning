package swing.basic.Kalender;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Kalender kalender = new Kalender();
        kalender.setContentPane(kalender.mainPan);
        kalender.setTitle("Kalender");
        kalender.setSize(300,400);
        kalender.pack();
        kalender.setVisible(true);
        kalender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
