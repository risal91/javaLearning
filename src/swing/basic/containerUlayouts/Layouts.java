package swing.basic.containerUlayouts;

import javax.swing.*;
import java.awt.*;
//Top Level Container
public class Layouts extends JFrame {

    public Layouts(){

        setSize(new Dimension(500,400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,3));


        //Light weight container
        for (int i = 0; i < 9; i++) {

            JPanel panel = new JPanel();
            if( i %2 == 0){
                panel.setBackground(Color.black);
            }
            else {
                panel.setBackground(Color.white);
            }
            add(panel);
        }






    }


}
