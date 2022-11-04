import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;

public class PreferencePrompt extends Main {
    void window(){

        Main main = new Main();
        Themes themes = new Themes();
        String themeCollection[] = {"Snow Land", "Pink Cloud", "Green Plains", "Galaxy Haze", "Chaotic Love", "Purple Fog", "Shining Mirror", "Oribi", "Color Fusion", "Abstract Thoughts", "Tinted Glass", "Summer Shade", "Lost feelings"};
        String fontCollection[] = {"Arial", "Helvetica", "Open Sans", "Futura"};

        JLabel themeText = new JLabel("Themes");
        JLabel fontText = new JLabel("Fonts");
        JButton okayButton = new JButton("Okay");
        JButton applyButton = new JButton("Apply");
        JButton cancelButton = new JButton("Cancel");
        ImageIcon imageIcon = new ImageIcon("oribi-logo-64.png");
        JComboBox themeDropDown = new JComboBox(Arrays.stream(themeCollection).sorted().toArray());
        JComboBox fontStyle = new JComboBox(Arrays.stream(fontCollection).sorted().toArray());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        JFrame frame = new JFrame("Preferences");
        frame.setIconImage(imageIcon.getImage());
        frame.setLayout(new GridBagLayout());
        frame.setSize(480, 240);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        themeDropDown.setSelectedIndex(6);

        themeDropDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (themeDropDown.getSelectedIndex()){
                    case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                        themes.themeNumber = themeDropDown.getSelectedIndex();
                        themes.updateTheme(themeDropDown.getSelectedIndex());
                        System.out.println("index: " + themeDropDown.getSelectedIndex() + "[Theme number]: " + themes.themeNumber);
                        panel1.repaint();
                        textArea.repaint();
                        break;
                    default:
                        themes.updateTheme(themeDropDown.getSelectedIndex());
                        System.out.println("index: " + themeDropDown.getSelectedIndex());
                        break;
                }
            }
        });

        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        frame.add(themeText, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        frame.add(fontText, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.add(themeDropDown, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        frame.add(fontStyle, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        frame.add(okayButton, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        frame.add(cancelButton, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        frame.add(applyButton, gridBagConstraints);
    }
}