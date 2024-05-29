package swing.basic.Kalender;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Objects;


public class Kalender extends JFrame {
    protected JButton button1;
    protected JButton button2;
    protected JButton button3;
    protected JButton button4;
    protected JButton button5;
    protected JButton button6;
    protected JButton button7;
    protected JButton button8;
    protected JButton button9;
    protected JButton button10;
    protected JButton button11;
    protected JButton button12;
    protected JButton button13;
    protected JButton button14;
    protected JButton button15;
    protected JButton button16;
    protected JButton button17;
    protected JButton button18;
    protected JButton button19;
    protected JButton button20;
    protected JButton button21;
    protected JButton button22;
    protected JButton button23;
    protected JButton button24;
    protected JButton button25;
    protected JButton button26;
    protected JButton button27;
    protected JButton button28;
    protected JButton button29;
    protected JButton button30;
    protected JButton button31;
    protected JButton button32;
    protected JButton button33;
    protected JButton button34;
    protected JButton button35;
    protected JButton button36;
    protected JButton button37;
    protected JButton button38;
    protected JButton button39;
    protected JButton button40;
    protected JButton button41;
    protected JButton button42;
    protected JButton vorMonat;
    protected JButton nächsterMonat;
    protected JLabel monat;
    protected JLabel jahr;
    protected JLabel Tag;
    protected JLabel wochentag;
    protected JPanel mainPan;
    protected static int tag;
    protected static int wochenTag;
    protected static JButton[] buttons = new JButton[42];
    protected static int aktuellerMonat;




    static LocalDate date = LocalDate.now();
    static LocalDate monatdatum = LocalDate.of(date.getYear(), date.getMonth(),1);

    public static void ersterTagdesMonats(){

        switch (monatdatum.getDayOfWeek()){
            case MONDAY -> wochenTag = 0;
            case TUESDAY -> wochenTag = 1;
            case WEDNESDAY -> wochenTag = 2;
            case THURSDAY -> wochenTag = 3;
            case FRIDAY -> wochenTag = 4;
            case SATURDAY -> wochenTag = 5;
            case SUNDAY -> wochenTag = 7;
        }

    }

    public static void wievieleTagehatDerMonat(){

    tag = monatdatum.lengthOfMonth();
    }

    public static void kalendererstellen(){
        int zaehler = 1;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText("");
        }

        for (int i = wochenTag; i < wochenTag + tag; i++) {
            buttons[i].setText(String.valueOf(zaehler));
            zaehler++;
        }

    }

    public void informationchange(){
        jahr.setText(String.valueOf(monatdatum.getMonth()));
    }



    public Kalender() {
        informationchange();
        aktuellerMonat = date.getMonthValue();
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;
        buttons[9] = button10;
        buttons[10] = button11;
        buttons[11] = button12;
        buttons[12] = button14;
        buttons[13] = button13;
        buttons[14] = button15;
        buttons[15] = button16;
        buttons[16] = button17;
        buttons[17] = button18;
        buttons[18] = button19;
        buttons[19] = button20;
        buttons[20] = button21;
        buttons[21] = button22;
        buttons[22] = button23;
        buttons[23] = button24;
        buttons[24] = button25;
        buttons[25] = button26;
        buttons[26] = button27;
        buttons[27] = button28;
        buttons[28] = button29;
        buttons[29] = button30;
        buttons[30] = button31;
        buttons[31] = button32;
        buttons[32] = button33;
        buttons[33] = button34;
        buttons[34] = button35;
        buttons[35] = button36;
        buttons[36] = button37;
        buttons[37] = button38;
        buttons[38] = button39;
        buttons[39] = button40;
        buttons[40] = button41;
        buttons[41] = button42;

        ersterTagdesMonats();
        wievieleTagehatDerMonat();

        kalendererstellen();




        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jbn = (JButton)e.getSource();


                switch (jbn.getName()){
                    case "vorMonat":
                        aktuellerMonat = aktuellerMonat -1;
                        monatdatum = LocalDate.of(date.getYear(), aktuellerMonat,1);
                        ersterTagdesMonats();
                        wievieleTagehatDerMonat();
                        kalendererstellen();
                        informationchange();
                    break;
                    case "nextMonth":
                        aktuellerMonat = aktuellerMonat +1;
                        monatdatum = LocalDate.of(date.getYear(), aktuellerMonat,1);
                        ersterTagdesMonats();
                        wievieleTagehatDerMonat();
                        kalendererstellen();
                        informationchange();
                        break;
                }

            }
        };

        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button10.addActionListener(listener);
        button11.addActionListener(listener);
        button12.addActionListener(listener);
        button13.addActionListener(listener);
        button14.addActionListener(listener);
        button15.addActionListener(listener);
        button16.addActionListener(listener);
        button17.addActionListener(listener);
        button18.addActionListener(listener);
        button19.addActionListener(listener);
        button20.addActionListener(listener);
        button21.addActionListener(listener);
        button22.addActionListener(listener);
        button23.addActionListener(listener);
        button24.addActionListener(listener);
        button25.addActionListener(listener);
        button26.addActionListener(listener);
        button27.addActionListener(listener);
        button28.addActionListener(listener);
        button29.addActionListener(listener);
        button30.addActionListener(listener);
        button31.addActionListener(listener);
        button32.addActionListener(listener);
        button33.addActionListener(listener);
        button34.addActionListener(listener);
        button35.addActionListener(listener);
        button36.addActionListener(listener);
        button37.addActionListener(listener);
        button38.addActionListener(listener);
        button39.addActionListener(listener);
        button40.addActionListener(listener);
        button41.addActionListener(listener);
        button42.addActionListener(listener);
        vorMonat.addActionListener(listener);
        nächsterMonat.addActionListener(listener);

    }
}

