
package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.Customizer;

public class TabbedPaneDemo extends JFrame{

    CustomJFrame frame1 = new CustomJFrame(1,2,3);
    CustomJFrame frame2 = new CustomJFrame(4,5,6);
    CustomJFrame frame3 = new CustomJFrame(7,8,9);

    public static void main(String[] args)
    {

        TabbedPaneDemo win = new TabbedPaneDemo();


        JTabbedPane tab = new JTabbedPane();

        tab.addTab("화면1", win.frame1);
        tab.addTab("화면2", win.frame2);
        tab.addTab("화면3",win.frame3);

        win.add(tab);

        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(500,800);
        win.setVisible(true);

    }
}

