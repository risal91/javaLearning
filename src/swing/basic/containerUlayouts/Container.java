package swing.basic.containerUlayouts;

import javax.swing.*;
import java.awt.*;
//Top Level Container
public class Container extends JFrame {

    public Container(){

        setSize(new Dimension(500,400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Light weight container
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        add(panel);


    }}
