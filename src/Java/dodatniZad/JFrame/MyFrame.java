package Java.dodatniZad.JFrame;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{

    MyFrame(){

        this.setLayout(null);
        this.setTitle("Ovdje ide title od prozora");
        this.setSize(720, 480);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0, 255, 234));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
