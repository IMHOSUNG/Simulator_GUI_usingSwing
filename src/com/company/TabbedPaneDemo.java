
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
    static int data[] = new int[20];

    public static void main(String[] args)
    {
        CustomJFrame frame1 = new CustomJFrame(1,2,3, data);
        CustomJFrame frame2 = new CustomJFrame(4,5,6, data);
        CustomJFrame frame3 = new CustomJFrame(7,8,9, data);

        TabbedPaneDemo win = new TabbedPaneDemo();

        JTabbedPane tab = new JTabbedPane();

        tab.add("화면1",frame1);
        tab.add("화면2",frame2);
        tab.add("화면3",frame3);

        win.add(tab);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(500,800);
        win.setVisible(true);


        while(true) {
            for(int i = 1 ; i <= 9 ; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}

