package dodatniZad.popupPoruka;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] response = { "Super", "OK"};
        //ImageIcon icon = new ImageIcon("");
        JOptionPane.showOptionDialog(
                null,
                "Kako si?",
                "Pitanje",
                JOptionPane.YES_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                response,
                0
        );
    }
}
