package windows;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MoniteringSimulator {
    static int data[] = new int[20];
    GeneralPanel general_panel = new GeneralPanel(data);
    BatteryPanel batteryPanel = new BatteryPanel(data);
    TirePanel tirePanel = new TirePanel(data);

    public MoniteringSimulator() {
        JTabbedPane tabPane = new JTabbedPane();

        tabPane.add("General Information", general_panel);
        tabPane.add("Tire Information", batteryPanel);
        tabPane.add("Battery Information", tirePanel);
        JFrame frame = new JFrame("Tabbed Pane with Background");
        frame.setContentPane(tabPane);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,480);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    public static void setDefaultData(){
        data[0] = 80;
        data[1] = 2000;
        data[2] = 100;
        data[3] = 130;
        data[4] = 14;
        data[5] = 77;
        data[6] = 7777;
        data[8] = 0;
        data[9] = 77;
        data[10] = 14;
        data[11] = 20;
        data[12] = 38;
        data[13] = 38;
        data[14] = 38;
        data[15] = 39;
    }
    public static void main(String[] args) {

        setDefaultData();
        new MoniteringSimulator();

        while(true)
        {

        }
    }
}
