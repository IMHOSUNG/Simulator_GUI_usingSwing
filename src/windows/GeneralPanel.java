package windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneralPanel extends JPanel {

    Custompanel speed_param;
    Custompanel rmp_param;
    Custompanel engine_load_param;
    Custompanel engine_temp_param;
    Custompanel fuel_economy_param;
    Custompanel today_driven_param;
    Custompanel total_distance_param;

    URL general_panel = this.getClass().getResource("./images/general_panel.png");
    private BufferedImage background_img;

    GeneralPanel(int[] data)
    {
        /*
        set background img
         */
        try {
            background_img = ImageIO.read(general_panel);
        } catch (IOException ex) {
            Logger.getLogger(GeneralPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


        //init params
        speed_param = new Custompanel(0, "km",  data);
        rmp_param = new Custompanel(1, "rpm", data);
        engine_load_param = new Custompanel(2, "kg", data);
        engine_temp_param = new Custompanel(3, "kg",data);
        fuel_economy_param = new Custompanel(4, "kg",data);
        today_driven_param = new Custompanel(5, "kg",data);
        total_distance_param = new Custompanel(6, "kg",data);


        //set layout
        setLayout(null);

        speed_param.setLocation(150,18);
        rmp_param.setLocation(537,18);
        engine_load_param.setLocation(150,113);
        engine_temp_param.setLocation(537,113);
        fuel_economy_param.setLocation(150,206);
        today_driven_param.setLocation(537,206);
        total_distance_param.setLocation(150,309);

        add(speed_param);
        add(rmp_param);
        add(engine_load_param);
        add(engine_temp_param);
        add(fuel_economy_param);
        add(today_driven_param);
        add(total_distance_param);


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
