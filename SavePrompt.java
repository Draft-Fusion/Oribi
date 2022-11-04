import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

//This is creating a new window for saving a new file :D
public class SavePrompt implements ActionListener {

    JFileChooser fileChooser = new JFileChooser();
    JFrame frame = new JFrame("Warning!");
    JButton cancelButton = new JButton("Cancel");
    JButton yesButton = new JButton("Yes");
    JButton noButton = new JButton("No");
    JLabel label = new JLabel("Would you like to save?");
    ImageIcon imageIcon = new ImageIcon("oribi-logo-64.png");
    void window() {

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showDialog(frame, "Save");
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setIconImage(imageIcon.getImage());
        frame.setLayout(new BorderLayout(64, 128 + 32));
        frame.setSize(480, 240);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(yesButton, BorderLayout.WEST);
        frame.add(noButton, BorderLayout.CENTER);
        frame.add(cancelButton, BorderLayout.EAST);
        frame.add(label, BorderLayout.PAGE_START);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(yesButton)) {
            //show and use file chooser
        }
    }
}