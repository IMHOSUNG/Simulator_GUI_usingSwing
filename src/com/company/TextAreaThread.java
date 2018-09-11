package com.company;

import javax.swing.*;

class TextAreaThread implements Runnable{

    private JTextArea textArea = null;
    private twoIntValue in = null;
    int value = 0;
    int pannel_id = 0;

    TextAreaThread(JTextArea textArea, twoIntValue in, int value, int id)
    {
        this.textArea = textArea;
        this.in = in;
        this.value = value;
        this.pannel_id = id;
    }

    @Override
    public void run(){
        while(true)
        {
            System.out.println(textArea.getText()+String.valueOf(pannel_id));
        }
    }
}
