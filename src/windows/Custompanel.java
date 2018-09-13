package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

class Custompanel extends JPanel {

    JLabel label ;

    public int value = 0;
    private String unit;

    public int id = 0;

    private JButton upButton;
    private JButton downButton;

    URL up_img_url = this.getClass().getResource("./images/upper_arrow.png");
    URL down_img_url= this.getClass().getResource("./images/down_arrow.png");;
    ImageIcon up_img = new ImageIcon(up_img_url);
    ImageIcon down_img = new ImageIcon(down_img_url);

    public int[] data;

    public Custompanel(int id, String unit, int[] data )
    {
        this.unit = unit;
        this.id = id;
        setLayout(null);
        //setBackground(new Color(0,0,0,0));
        setOpaque(false);


        upButton = new JButton(up_img);
        upButton.setSize(30,30);
        upButton.setLocation(200 ,0);

        add(upButton);

        downButton = new JButton(down_img);
        downButton.setSize(30,30);
        downButton.setLocation(200,30);
        add(downButton);


        label = new JLabel();
        label.setSize(200,40);
        label.setLocation(0,13);
        label.setFont(new Font("Serif",Font.BOLD,35));
        label.setForeground(Color.white);
        label.setText(String.valueOf(value) + " " + unit + "  ");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        add(label);

        setSize(new Dimension(230,70));
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
            label.setText(String.valueOf(value) + " " + unit + "  ");
            data[id]++;
        }
    }

    class downButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value--;

            label.setText(String.valueOf(value) + " " + unit + "  ");
            data[id]--;
        }
    }

}
