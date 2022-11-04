//Oribi Made by Draft_Fusion v2.1a

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.FileWriter;
import javax.swing.*;
import java.io.File;
import java.awt.*;

public class Main {

    public static int WIDTH = 720, HEIGHT = 480;
    public static JMenuItem exit_fileItem;
    public static JTextArea textArea = new JTextArea();
    public static JPanel panel1 = new JPanel();
    public static void main(String[] args) {
        Themes themes = new Themes();
        JFileChooser fileChooser = new JFileChooser();
        AboutPrompt aboutPrompt = new AboutPrompt();
        SavePrompt savePrompt = new SavePrompt();
        PreferencePrompt preferencePrompt = new PreferencePrompt();
        ImageIcon imageIcon = new ImageIcon("oribi-logo-64.png");

        File userFile = new File("test.txt");
        JFrame frame = new JFrame("Oribi v2.1a");

        JMenuBar menuBar = new JMenuBar();
        JPanel panel = new JPanel();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu settingsMenu = new JMenu("Settings");
        JMenu aboutMenu = new JMenu("About");

        JMenuItem new_fileItem = new JMenuItem("New");
        JMenuItem open_fileItem = new JMenuItem("Open");
        JMenuItem save_fileItem = new JMenuItem("Save");
        JMenuItem about_item = new JMenuItem("About");

        JMenuItem copyText_item = new JMenuItem("Copy");
        JMenuItem pastText_item = new JMenuItem("Paste");
        JMenuItem deleteText_item = new JMenuItem("Delete");
        JMenuItem convertText_item = new JMenuItem("Convert");

        JMenuItem textColor = new JMenuItem("Text Color");
        JMenuItem textBackground = new JMenuItem("Text Background");
        JMenuItem editorBackground = new JMenuItem("Editor Background");
        JMenuItem preferences = new JMenuItem("Preferences");

        exit_fileItem = new JMenuItem("Exit");
        JTextArea textArea = new JTextArea(WIDTH - 48, HEIGHT - 64 - 32);

        themes.updateTheme(themes.themeNumber); //Update program when theme is changed

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(settingsMenu);
        menuBar.add(aboutMenu);
        frame.setJMenuBar(menuBar);

        fileMenu.add(new_fileItem);
        fileMenu.add(open_fileItem);
        fileMenu.add(save_fileItem);
        fileMenu.add(exit_fileItem);

        editMenu.add(copyText_item);
        editMenu.add(pastText_item);
        editMenu.add(deleteText_item);
        editMenu.add(convertText_item);

        settingsMenu.add(textColor);
        settingsMenu.add(textBackground);
        settingsMenu.add(editorBackground);
        settingsMenu.add(preferences);

        aboutMenu.add(about_item);

        textArea.setEnabled(true);
        textArea.setLineWrap(true);
        textArea.setFocusable(true);
        textArea.setAutoscrolls(true);
        textArea.setDoubleBuffered(true);
        textArea.setForeground(themes.getTextColored());
        textArea.setBackground(themes.getTextBackgroundColor());
        textArea.setMargin(new Insets(8, 8, 8, 8));

        //Action listeners (used for interactions like clicking mouse and pressing buttons)
        //This also allows for many fun cool things to happen like auto clickers and what not..
        //Well for the most part.. anyways this is just a note to self.
        new_fileItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea.getText().equals(null)) {
                    //make a new file
                } else {
                    //pop up window asking to save
                    savePrompt.window();
                }
            }
        });

        save_fileItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showDialog(frame, "Save");
                if (fileChooser.accept(userFile)) {
                    fileChooser.setCurrentDirectory(new File("C:\\Users\\"));

                    try {
                        fileChooser.getSelectedFile().getAbsolutePath();
                        FileWriter userWrite = new FileWriter(fileChooser.getSelectedFile().getAbsolutePath());
                        userWrite.write(textArea.getText());
                        userFile.createNewFile();
                        userWrite.close();

                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                }
            }
        });

        open_fileItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showDialog(frame, "Open");
            }
        });

        exit_fileItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        textColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Text Color", new Color(themes.textColored.getRGB()));
                textArea.setForeground(color);
                textArea.repaint();
            }
        });

        textBackground.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Text Background", new Color(themes.textBackgroundColor.getRGB()));
                textArea.setBackground(color);
                textArea.repaint();
            }
        });

        editorBackground.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Editor Background", new Color(themes.editorColor.getRGB()));
                panel1.setBackground(color);
                textArea.repaint();
            }
        });

        preferences.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preferencePrompt.window();
            }
        });

        about_item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutPrompt.window();
            }
        });

        textArea.setFont(new Font("Ariel", 1, 17));
        textArea.setLineWrap(true);
        textArea.setTabSize(4);
        textArea.setEditable(true);

        panel.setLayout(new BorderLayout());
        //panel.setBackground(new Color(144, 183, 201));                   //Oddly this can be seen sometimes basically keeping in here to fix later on
        panel.setSize(WIDTH - 48, HEIGHT - 64 - 32);
        panel.setLocation(16, 16);

        panel1.setLayout(new BorderLayout());
        //panel1.setBackground(themes.editorColor);
        panel1.setBackground(themes.getEditorColor());

        frame.setIconImage(imageIcon.getImage());
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setAlwaysOnTop(false);

        frame.add(panel);
        frame.add(panel1, BorderLayout.CENTER);
        panel.add(textArea);
    }
}