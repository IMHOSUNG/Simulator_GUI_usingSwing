package com.company;

import javax.swing.*;
import java.awt.*;

public class CustomJFrame extends JFrame {



    CustomJFrame(int id1, int id2, int id3)
    {
        Custompanel panel1 = new Custompanel(new twoIntValue(1000,10,0),id1);
        Custompanel panel2 = new Custompanel(new twoIntValue(1000,10,0),id2);
        Custompanel panel3 = new Custompanel(new twoIntValue(1000,10,0),id3);

        setLayout(new BorderLayout());
        setVisible(true);
        setSize(500,500);
        add(panel1);
        add(panel2);
        add(panel3);
    }
}
