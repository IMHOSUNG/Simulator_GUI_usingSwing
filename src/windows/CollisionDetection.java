package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CollisionDetection extends JPanel{
    private boolean is_collision = false;       //set true if collision occur

    private JButton collision_button = new JButton();
    private JLabel collision_label = new JLabel("COLLISION BUTTON");
    private int id;
    public int[] data;

    CollisionDetection(int id, int[] data){
        this.id = id;
        data[id] = (is_collision) ? 1 : 0;
        this.setLayout(null);
        collision_button.setLocation(200, 0);
        collision_button.setSize(50, 50);
        collision_button.setBackground(Color.GREEN);

        collision_label.setLocation(0, 0);
        collision_label.setSize(150, 100);
        collision_label.setFont(new Font("Serif",Font.BOLD,10));
        collision_label.setForeground(Color.RED);

        this.add(collision_button);
        this.add(collision_label);
        this.setOpaque(false);
        this.setSize(300, 100);
        this.setVisible(true);

        collision_button.addActionListener(new CollisionButtonListener());

    }

    class CollisionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //when collision is detected, is_collision become 1
            if(!is_collision){
                is_collision = true;
                data[id] = (is_collision) ? 1 : 0;
                collision_button.setBackground(Color.RED);
            }else{
                is_collision = false;
                data[id] = (is_collision) ? 1 : 0;
                collision_button.setBackground(Color.GREEN);
            }

        }
    }




}
