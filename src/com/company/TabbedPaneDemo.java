
package com.company;
/*
import javafx.scene.control.Tab;
import sun.awt.image.ToolkitImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.beans.Customizer;
import java.io.IOException;
import java.net.URL;

public class TabbedPaneDemo{
    static int data[] = new int[20];

    private BufferedImage bg;



    Container contentPane;

    public TabbedPaneDemo(){


        CustomJFrame frame2 = new CustomJFrame(4,5,6, data);
        CustomJFrame frame3 = new CustomJFrame(7,8,9, data);

        try{
            bg = ImageIO.read(new URL(("background.jpg")));
        }
        catch (IOException ex){
        }

        JPanel tabPanel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };

        tabPanel.add(frame1);

        JTabbedPane tabPane = new JTabbedPane();
        tabPane.add("Panel with Bachground", tabPanel);

        JFrame frame = new JFrame("Tabbed Pane with Background");
        frame.setContentPane(tabPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new TabbedPaneDemo();

        while(true) {
            for(int i = 1 ; i <= 9 ; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}*/

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TabbedPaneDemo {
    static int data[] = new int[20];


    CustomJFrame frame1 = new CustomJFrame(1,2,3,  data );

    private BufferedImage bg;

    public TabbedPaneDemo() {
        JTabbedPane tabPane = new JTabbedPane();

        tabPane.add("Panel with Bachground", frame1);

        JFrame frame = new JFrame("Tabbed Pane with Background");
        frame.setContentPane(tabPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        /*SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TabbedPaneDemo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });*/
        new TabbedPaneDemo();

        while(true)
        {
            for(int i = 1; i < 4 ; i++)
            {
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }
}
