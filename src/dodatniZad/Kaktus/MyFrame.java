package dodatniZad.Kaktus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("cactussss.png");
        ImageIcon icon1 = new ImageIcon("fist.png");

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.setText("Ja sam");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setBackground(Color.GREEN);
        button.addActionListener(this);
        button.setFont(new Font("Courier",Font.BOLD,20));

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(450,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Boc!");
            int r=10;
        }
    }
}
