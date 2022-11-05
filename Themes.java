import java.awt.*;

public class Themes extends Main {

    static Color textColored = new Color(16, 16, 16);
    static Color textBackgroundColor = new Color(192, 192, 192);
    static Color editorColor = new Color(151, 144, 159);

    public void updateTheme(int selectedIndex) {
        switch (selectedIndex) {
            case 0: //abstract thoughts
                textArea.setForeground(textColored = new Color(134, 104, 159));
                textArea.setBackground(textBackgroundColor = new Color(139, 231, 139));
                editorColor = new Color(107, 163, 183);
                textArea.repaint();
                break;
            case 1: //chaotic love
                textColored = new Color(102, 105, 2);
                textBackgroundColor = new Color(234, 135, 238);
                editorColor = new Color(173, 123, 102);
                textArea.repaint();
                break;
            case 2: //color fusion
                textColored = new Color(246, 230, 82);
                textBackgroundColor = new Color(89, 161, 89);
                editorColor = new Color(148, 36, 80);
                textArea.repaint();
                break;
            case 3: //galaxy haze
                textColored = new Color(69, 68, 86);
                textBackgroundColor = new Color(130, 101, 159);
                editorColor = new Color(75, 71, 100);
                textArea.repaint();
                break;

            case 4: //green plains
                textColored = new Color(107, 134, 55);
                textBackgroundColor = new Color(103, 159, 101);
                editorColor = new Color(100, 93, 71);
                textArea.repaint();
                break;

            case 5: //lost feelings
                textColored = new Color(210, 210, 222);
                textBackgroundColor = new Color(94, 101, 105);
                editorColor = new Color(86, 72, 83);
                textArea.repaint();
                break;

            case 6: //oribi
                textColored = new Color(16, 16, 16);
                textBackgroundColor = new Color(192, 192, 192);
                editorColor = new Color(151, 144, 159);
                textArea.repaint();
                break;

            case 7: //pink cloud
                textColored = new Color(224, 179, 194);
                textBackgroundColor = new Color(185, 95, 167);
                editorColor = new Color(168, 50, 71);
                textArea.repaint();
                break;

            case 8: //purple fog
                textColored = new Color(58, 55, 82);
                textBackgroundColor = new Color(143, 108, 196);
                editorColor = new Color(80, 63, 103);
                textArea.repaint();
                break;

            case 9: //shining mirror
                textColored = new Color(194, 208, 185);
                textBackgroundColor = new Color(116, 161, 124);
                editorColor = new Color(94, 133, 127);
                textArea.repaint();
                break;

            case 10: //snow land
                textColored = new Color(245, 249, 255); //new Color(202, 250, 230);
                textBackgroundColor = new Color(189, 207, 236);//new Color(151, 197, 204);
                editorColor = new Color(179, 185, 197);
                textArea.repaint();
                break;

            case 11: //summer shade
                textColored = new Color(72, 146, 199);
                textBackgroundColor = new Color(243, 223, 102);
                editorColor = new Color(80, 114, 75);
                textArea.repaint();
                break;

            case 12: //tinted glass
                textColored = new Color(113, 123, 128);
                textBackgroundColor = new Color(78, 93, 93);
                editorColor = new Color(57, 72, 84);
                textArea.repaint();
                break;
        }
    }

    public Color getTextColored() {
        return textColored;
    }

    public Color getEditorColor() {
        return editorColor;
    }

    public Color getTextBackgroundColor() {
        return textBackgroundColor;
    }

}