package com.company;

import javax.swing.*;
import java.awt.*;

public class CustomJFrame extends JFrame {

    Custompanel panel1 = null;
    Custompanel panel2 = null;
    Custompanel panel3 = null;
    JPanel bottom = new JPanel();

    CustomJFrame(int id1, int id2, int id3)
    {

        setLayout(null);
        panel1 = new Custompanel(new twoIntValue(1000,10,0),new twoIntValue(0,0,1),id1);
        panel2 = new Custompanel(new twoIntValue(1000,10,0),new twoIntValue(100,100,1),id2);
        panel3 = new Custompanel(new twoIntValue(1000,10,0),new twoIntValue(200,200,1),id3);


        //panel1.setPreferredSize(new Dimension(400,400));
        //panel1.setLayout(null);
        panel1.setSize(200,200);
        panel1.setLocation(100,100);
        getContentPane().add(panel1);

        panel2.setSize(200,200);
        panel2.setLocation(300,300);
        getContentPane().add(panel2);

        panel3.setSize(200,200);
        panel3.setLocation(0,0);
        getContentPane().add(panel3);

        setSize(500,500);
        setVisible(true);

    }
}
