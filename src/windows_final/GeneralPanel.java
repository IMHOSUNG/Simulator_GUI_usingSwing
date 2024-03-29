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

    private Custompanel speed_param;
    private Custompanel rmp_param;
    private Custompanel engine_load_param;
    private Custompanel engine_temp_param;
    private Custompanel fuel_economy_param;
    private Custompanel today_driven_param;
    private Custompanel total_distance_param;
    private CollisionDetection collision_param;
    private URL general_panel = this.getClass().getResource("./images/general_panel.png");
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
        engine_load_param = new Custompanel(2, "%", data);
        engine_temp_param = new Custompanel(3, "˚C",data);
        fuel_economy_param = new Custompanel(4, "km/l",data);
        today_driven_param = new Custompanel(5, "km",data);
        total_distance_param = new Custompanel(6, "km",data);
        collision_param = new CollisionDetection(7, data);

        //set layout
        setLayout(null);


        fuel_economy_param.setLocation(115,18);
        today_driven_param.setLocation(525,18);
        speed_param.setLocation(0,180);
        rmp_param.setLocation(330,180);
        engine_load_param.setLocation(525,110);
        engine_temp_param.setLocation(525,215);
        total_distance_param.setLocation(200,330);
        collision_param.setLocation(437, 309);
        add(speed_param);
        add(rmp_param);
        add(engine_load_param);
        add(engine_temp_param);
        add(fuel_economy_param);
        add(today_driven_param);
        add(total_distance_param);
        add(collision_param);

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
