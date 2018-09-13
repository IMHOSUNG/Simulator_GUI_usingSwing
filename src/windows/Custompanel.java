package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

class Custompanel extends JPanel {

    JLabel label ;

    public int value = 0;
    public int id = 0;

    private JButton upButton;
    private JButton downButton;

    URL up_img_url = this.getClass().getResource("./images/upper_arrow.png");
    URL down_img_url= this.getClass().getResource("./images/down_arrow.png");;
    ImageIcon up_img = new ImageIcon(up_img_url);
    ImageIcon down_img = new ImageIcon(down_img_url);

    public int[] data;

    public Custompanel(twoIntValue in, twoIntValue pos , int id, int[] data )
    {
        setLayout(null);
        //setBackground(new Color(0,0,0,0));
        setOpaque(false);
        this.id = id;

        upButton = new JButton(up_img);
        upButton.setSize(30,30);
        upButton.setLocation(0 ,0);

        add(upButton);

        downButton = new JButton(down_img);
        downButton.setSize(30,30);
        downButton.setLocation(0,40);
        add(downButton);

        /*valueArea = new JTextArea();
        valueArea.setSize(70,70);
        valueArea.setLocation(100, 0);
        valueArea.setText(String.valueOf(value));
        add(valueArea);
        */

        label = new JLabel();
        label.setSize(40,40);
        label.setLocation(50,25);
        label.setFont(new Font("Serif",Font.BOLD,40));
        label.setForeground(Color.white);
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
