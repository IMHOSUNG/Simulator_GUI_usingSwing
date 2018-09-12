package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomJFrame extends JPanel {

    Custompanel panel1 = null;
    Custompanel panel2 = null;
    Custompanel panel3 = null;

    private BufferedImage bg;



    CustomJFrame(int id1, int id2, int id3, int[] data)
    {
        try {
            bg = ImageIO.read(new URL("http://2.bp.blogspot.com/-wWANHD-Dr00/TtSmeY57ZXI/AAAAAAAABB8/t-fpXmQZ0-Y/s1600/Vector_by_Karpiu23.png"));
        } catch (IOException ex) {
            Logger.getLogger(CustomJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        panel1 = new Custompanel(new twoIntValue(1000,10,0),new twoIntValue(0,0,1),id1, data);
        panel2 = new Custompanel(new twoIntValue(1000,10,0),new twoIntValue(100,100,1),id2, data);
        panel3 = new Custompanel(new twoIntValue(1000,10,0),new twoIntValue(200,200,1),id3, data);

        setLayout(null);

        //panel1.setPreferredSize(new Dimension(400,400));
        //panel1.setLayout(null);
        panel1.setSize(200,200);
        panel1.setLocation(100,100);
        //getContentPane().add(panel1);
        add(panel1);

        panel2.setSize(200,200);
        panel2.setLocation(300,300);
        add(panel2);
        //getContentPane().add(panel2);

        panel3.setSize(200,200);
        panel3.setLocation(0,0);
        add(panel3);
        //getContentPane().add(panel3);

        //revalidate();
//        setSize(getWidth(),getHeight());
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }
}
