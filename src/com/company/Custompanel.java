package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Custompanel extends JPanel {

    public int value = 0;
    public int id = 0;

    private JButton upButton;
    private JButton downButton;
    private JTextArea valueArea;
    private JPanel window = new JPanel();


    public Custompanel(twoIntValue in, twoIntValue pos , int id )
    {
        setLayout(null);
        this.id = id;

        upButton = new JButton("up");
        upButton.setSize(70,20);
        upButton.setLocation(10 ,0);
        add(upButton);

        downButton = new JButton("down");
        downButton.setSize(70,20);
        downButton.setLocation(10,50);
        add(downButton);

        valueArea = new JTextArea();
        valueArea.setSize(70,70);
        valueArea.setLocation(100, 0);
        valueArea.setText(String.valueOf(value));
        add(valueArea);

        setSize(new Dimension(120,100));
        upButton.addActionListener(new upButtonListener());
        downButton.addActionListener(new downButtonListener());
        Runnable runnable = new TextAreaThread(valueArea,in,value, id);
        Thread thread = new Thread(runnable);
        thread.start();
    }

    class upButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value++;
            valueArea.setText(String.valueOf(value));
        }
    }

    class downButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value--;
            valueArea.setText(String.valueOf(value));
        }
    }

}
