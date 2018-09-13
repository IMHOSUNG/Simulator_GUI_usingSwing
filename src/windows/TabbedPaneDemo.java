package windows;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo {
    static int data[] = new int[20];


    CustomJFrame frame1 = new CustomJFrame(1,2,3,  data );

    private BufferedImage bg;

    public TabbedPaneDemo() {
        JTabbedPane tabPane = new JTabbedPane();

        tabPane.add("Panel with Bachground", frame1);

        JFrame frame = new JFrame("Tabbed Pane with Background");
        frame.setContentPane(tabPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,480);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new TabbedPaneDemo();

        while(true)
        {
            for(int i = 1; i < 4 ; i++)
            {
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }
}
