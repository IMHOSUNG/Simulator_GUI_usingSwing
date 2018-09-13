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
        tabPane.add("Battery Information", batteryPanel);
        tabPane.add("Tire Information", tirePanel);
        JFrame frame = new JFrame("Tabbed Pane with Background");
        frame.setContentPane(tabPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,480);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new MoniteringSimulator();

        while(true)
        {
            for(int i = 0; i < 16 ; i++)
            {
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }
}
