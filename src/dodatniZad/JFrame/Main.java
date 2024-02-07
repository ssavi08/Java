package dodatniZad.JFrame;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("Small-1-Young-Fish-icon.png");

        label.setText("POZZ");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,200,200);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200,0,200,200);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,200,400,200);

        redPanel.add(label);

        frame.add(greenPanel);
        frame.add(redPanel);
        frame.add(bluePanel);
    }
}
