package zadatak_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ToolBar extends JPanel implements ActionListener {

    public static JButton clearButton;
    private JButton readFileButton;
    private JButton saveFileButton;


    public ToolBar() {
        setBackground(Color.lightGray);
        initPanelComps();
        layoutComps();
        activateComps();
        setVisible(true);

    }


    private void initPanelComps() {
        clearButton = new JButton("Clear");
        readFileButton = new JButton("Read");
        saveFileButton = new JButton("Save");
    }


    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        clearButton.setPreferredSize(new Dimension(100, 40));
        readFileButton.setPreferredSize(new Dimension(100, 40));
        saveFileButton.setPreferredSize(new Dimension(100, 40));
        clearButton.setEnabled(false);
        add(clearButton);
        add(readFileButton);
        add(saveFileButton);
    }

    public void activateComps() {
        clearButton.addActionListener(this);
        readFileButton.addActionListener(this);
        saveFileButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            ViewPanel.textArea.setText("");
        } else if (e.getSource() == readFileButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getAbsolutePath();
                File file = new File(fileName);
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(file);
                    int content;
                    while ((content = fis.read()) != -1) {
                        ViewPanel.textArea.append(String.valueOf((char) content));
                    }
                    fis.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == saveFileButton) {
            Person person = null;
            try {
                person = new Person(0, 0, null);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            person.getPersons();

        }
    }

    public class Person {
        private int id;
        private int cnt = 0;
        private double bmi;
        private String ageGroup;

        ArrayList<Person> persons = new ArrayList<>();

        public Person(int id, double bmi, String ageGroup) throws FileNotFoundException {
            this.id = cnt++;
            this.bmi = bmi;
            this.ageGroup = ageGroup;
        }

        public int getId() {
            return id;
        }

        public double getBmi() {
            return bmi;
        }

        public String getAgeGroup() {
            return ageGroup;
        }

        public ArrayList<Person> getPersons() {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getAbsolutePath();
                File file = new File(fileName);
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(file);
                    fos.write(ViewPanel.textArea.getText().getBytes());
                    fos.flush();
                    fos.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            return persons;
        }
    }
}