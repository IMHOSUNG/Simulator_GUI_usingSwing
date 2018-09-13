package windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatteryPanel extends JPanel {

    Custompanel left_top_param;
    Custompanel right_top_param;
    Custompanel left_down_param;
    Custompanel right_down_param;

    URL general_panel = this.getClass().getResource("./images/battery_panel.png");
    private BufferedImage background_img;

    BatteryPanel(int[] data)
    {
        /*
        set background img
         */
        try {
            background_img = ImageIO.read(general_panel);
        } catch (IOException ex) {
            Logger.getLogger(BatteryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


        //init params
        left_top_param = new Custompanel(7, "ah",  data);
        right_top_param = new Custompanel(8, "v", data);
        left_down_param = new Custompanel(9, "c", data);
        right_down_param = new Custompanel(10, "%",data);

        //set layout
        setLayout(null);

        left_top_param.setLocation(537,20);
        right_top_param.setLocation(537,100);
        left_down_param.setLocation(537,180);
        right_down_param.setLocation(537,300);

        add(left_top_param);
        add(right_top_param);
        add(left_down_param);
        add(right_down_param);


        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background_img, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 480);
    }
}
