package zadatak_2;

import javax.swing.*;

public class MainFrame extends JFrame {

    ToolBar toolBar;
    ViewPanel viewPanel;
    FormPanel formPanel;


    MainFrame() {
        setTitle("Simple GUI");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        initComps();
        layoutComps();
        activateComps();
        setVisible(true);
    }

    private void initComps() {
        toolBar = new ToolBar();
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }

    private void layoutComps() {
        setLayout(null);
        toolBar.setBounds(0, 0, 500, 50);
        add(toolBar);
        viewPanel.setBounds(0, 50, 500, 150);
        add(viewPanel);
        formPanel.setBounds(0, 200, 500, 300);
        add(formPanel);
    }

    private void activateComps() {
        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(FormPanelEvent fpe) {
                viewPanel.setTextArea(fpe.getHeight());
                viewPanel.setTextArea(fpe.getWeight());
                viewPanel.setTextArea(fpe.getAgeGroup());
                viewPanel.setTextArea(fpe.getBodyMassIndex());
            }
        });

        formPanel.activateComps();
    }
}
