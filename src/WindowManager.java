import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class WindowManager {

    public static JFrame mainFrame = new JFrame(); 
    public static final String TITLE = "Listable";
    public static final Dimension SIZE = new Dimension(600, 400);

    private static JPanel mainPanel = new JPanel();
    private static JTextArea inputArea = new JTextArea();
    private static JTextArea outputArea = new JTextArea();

    public static void initFrame() {
        mainFrame.setTitle(TITLE);
        mainFrame.setSize(SIZE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);

        drawCanvas();

        mainFrame.setVisible(true);
    }

    private static void drawCanvas() {
        mainPanel.setLayout(new GridLayout(1, 2));

        Border defaultBorder = BorderFactory.createLineBorder(Color.BLACK);

        inputArea.setBorder(defaultBorder);
        inputArea.getDocument().addDocumentListener(new CustomDocumentListener());

        outputArea.setBorder(defaultBorder);

        mainPanel.add(inputArea);
        mainPanel.add(outputArea);

        mainFrame.add(mainPanel);
    }

    public static JTextArea getInputArea() {
        return inputArea;
    }

    public static JTextArea getOutputArea() {
        return outputArea;
    }

}
