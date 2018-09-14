package windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TirePanel extends JPanel {

    Custompanel remain_param;
    Custompanel voltage_param;
    Custompanel temp_param;
    Custompanel life_param;

    URL general_panel = this.getClass().getResource("./images/battery_panel.png");
    private BufferedImage background_img;

    TirePanel(int[] data)
    {
        /*
        set background img
         */
        try {
            background_img = ImageIO.read(general_panel);
        } catch (IOException ex) {
            Logger.getLogger(TirePanel.class.getName()).log(Level.SEVERE, null, ex);
        }


        //init params
        remain_param = new Custompanel(12, "ah",  data);
        voltage_param = new Custompanel(13, "v", data);
        temp_param = new Custompanel(14, "˚c", data);
        life_param = new Custompanel(15, "%",data);

        //set layout
        setLayout(null);

        remain_param.setLocation(535,22);
        voltage_param.setLocation(535,108);
        temp_param.setLocation(535,208);
        life_param.setLocation(535,308);

        add(remain_param);
        add(voltage_param);
        add(temp_param);
        add(life_param);


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
