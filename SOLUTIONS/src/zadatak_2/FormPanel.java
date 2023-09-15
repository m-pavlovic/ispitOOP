package zadatak_2;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {


    JTextField heightField;
    JTextField weightField;
    JLabel heightLabel;
    JLabel weightLabel;
    JLabel ageGroupLabel;
    JButton button;
    JRadioButton seniorButton;
    JRadioButton juniorButton;
    ButtonGroup buttonGroup;

    FormPanel() {
        setLayout(null);
        setBackground(Color.lightGray);
        initComps();
        layoutComps();
        activateComps();
        setVisible(true);
    }

    private void initComps() {
        heightField = new JTextField();
        weightField = new JTextField();
        heightLabel = new JLabel("Height:");
        weightLabel = new JLabel("Weight:");
        ageGroupLabel = new JLabel("Age group:");
        button = new JButton("Calculate BMI");
        seniorButton = new JRadioButton("Senior");
        juniorButton = new JRadioButton("Junior");
        buttonGroup = new ButtonGroup();

    }

    private void layoutComps() {
        heightField.setBounds(100, 20, 150, 20);
        weightField.setBounds(100, 50, 150, 20);
        heightLabel.setBounds(40, 20, 100, 20);
        weightLabel.setBounds(40, 50, 100, 20);
        button.setBounds(320, 200, 150, 30);
        ageGroupLabel.setBounds(280, 20, 100, 20);
        seniorButton.setBounds(380, 50, 100, 20);
        juniorButton.setBounds(380, 80, 100, 20);
        buttonGroup.add(seniorButton);
        buttonGroup.add(juniorButton);
        add(heightField);
        add(weightField);
        add(heightLabel);
        add(weightLabel);
        add(ageGroupLabel);
        add(button);
        add(seniorButton);
        add(juniorButton);
    }

    private void activateComps() {
        button.addActionListener(e -> {
            String height = heightField.getText();
            Double heightDouble = Double.parseDouble(height);
            if (heightDouble < 0.0) {
                JOptionPane.showMessageDialog(null, "Height must be a positive number!");
                return;
            }
            String weight = weightField.getText();
            Double weightDouble = Double.parseDouble(weight);
            if (weightDouble < 0.0) {
                JOptionPane.showMessageDialog(null, "Weight must be a positive number!");
                return;
            }
            String ageGroup = "";
            if (seniorButton.isSelected()) {
                ageGroup = "Senior";
            } else if (juniorButton.isSelected()) {
                ageGroup = "Junior";
            }
            String resultString = "Height: " + height + "\nWeight: " + weight + "\nAge group: " + ageGroup;
            Double result = weightDouble / (heightDouble * heightDouble);
            ViewPanel.textArea.setText(resultString + "\nBMI: " + result);
            ToolBar.clearButton.setEnabled(true);
            resetForm();
        });

    }

    private void resetForm() {
        heightField.setText("");
        weightField.setText("");
        buttonGroup.clearSelection();
    }
}
