package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Custompanel extends JPanel {

    JLabel label ;

    public int value = 0;
    public int id = 0;

    private JButton upButton;
    private JButton downButton;
    private JTextArea valueArea;
    private JPanel window = new JPanel();

    public int[] data;

    public Custompanel(twoIntValue in, twoIntValue pos , int id, int[] data )
    {
        setLayout(null);
        setBackground(new Color(0,0,0,0));
        setOpaque(false);
        this.id = id;

        upButton = new JButton("up");
        upButton.setSize(70,20);
        upButton.setLocation(10 ,0);
        add(upButton);

        downButton = new JButton("down");
        downButton.setSize(70,20);
        downButton.setLocation(10,50);
        add(downButton);

        /*valueArea = new JTextArea();
        valueArea.setSize(70,70);
        valueArea.setLocation(100, 0);
        valueArea.setText(String.valueOf(value));
        add(valueArea);
        */

        label = new JLabel();
        label.setSize(40,40);
        label.setLocation(100,0);
        label.setFont(new Font("Serif",Font.BOLD,40));
        label.setText(String.valueOf(value));
        add(label);

        setSize(new Dimension(100,100));
        upButton.addActionListener(new upButtonListener());
        downButton.addActionListener(new downButtonListener());
        this.data = data;

        setVisible(true);
    }

    class upButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value++;
            //valueArea.setText(String.valueOf(value));
            label.setText(String.valueOf(value));
            data[id]++;
        }
    }

    class downButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value--;
            //valueArea.setText(String.valueOf(value));
            label.setText(String.valueOf(value));
            data[id]--;
        }
    }

}
