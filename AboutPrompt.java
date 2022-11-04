import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class AboutPrompt {
    void window() {
        JButton button = new JButton("Okay");

        ImageIcon imageIcon = new ImageIcon("oribi-logo-64.png");
        JLabel about_text_01 = new JLabel("Somethings could be added to make this text editor even better!");
        JLabel about_text_02 = new JLabel("At this moment this is all the program has to offer!");
        JLabel about_text_03 = new JLabel("Oribi version 2.1b under GPL v3.0");
        JLabel about_text = new JLabel("This program is written by Draft Fusion!");

        about_text_01.setBounds(0, 0, about_text_01.getWidth(), about_text_01.getHeight());
        about_text.setBounds(0, 0, about_text.getWidth(), about_text.getHeight());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        JFrame frame = new JFrame("About");
        frame.setIconImage(imageIcon.getImage());
        frame.setLayout(new GridBagLayout());
        frame.setSize(480, 240);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        frame.add(about_text, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;

        frame.add(about_text_01, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;

        frame.add(about_text_02, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;

        frame.add(about_text_03, gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        frame.add(button, gridBagConstraints);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}