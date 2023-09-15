package zadatak_2;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    public static JTextArea textArea;

    public ViewPanel() {
        initPanelComps();
        layoutComps();
        setVisible(true);
    }

    private void initPanelComps() {
        textArea = new JTextArea();
    }

    private void layoutComps() {
        setLayout(null);
        textArea.setBounds(0, 0, 500, 150);
        add(textArea);
    }

    public JTextArea getTextArea() {
        return textArea;
    }


}
