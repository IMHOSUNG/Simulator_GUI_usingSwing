package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Custompanel extends JPanel {

    public int value = 0;
    public int id = 0;

    private JButton upButton;
    private JButton downButton;
    private JTextArea valueArea;
    private JPanel window = new JPanel();


    public Custompanel(twoIntValue in, int id )
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

        upButton.addActionListener(new upButtonListener());
        downButton.addActionListener(new downButtonListener());

        Runnable runnable = new TextAreaThread(valueArea,in,value, id);
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public Custompanel(twoIntValue upButton_Location, twoIntValue downButton_Location, twoIntValue valueArea_Location, twoIntValue in)
    {
        setLayout(null);

        upButton = new JButton("up");
        upButton.setSize(70,20);
        upButton.setLocation(upButton_Location.x , upButton_Location.y);
        add(upButton);

        valueArea = new JTextArea();
        valueArea.setLocation(valueArea_Location.x, valueArea_Location.y);

        downButton = new JButton("down");
        downButton.setSize(70,20);
        downButton.setLocation(downButton_Location.x, downButton_Location.y);

        upButton.addActionListener(new upButtonListener());
        downButton.addActionListener(new downButtonListener());

        Runnable runnable = new TextAreaThread(valueArea,in,value, id);
        Thread thread = new Thread(runnable);
        thread.start();
    }

    void setValue(int random_number)
    {
        this.value = random_number;
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
