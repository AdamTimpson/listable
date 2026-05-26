import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

public class CustomDocumentListener implements DocumentListener {

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            String changedText = e.getDocument().getText(0, e.getDocument().getLength());
            String parsedText = new TableParser(changedText).getParsedText();

            WindowManager.getOutputArea().setText(parsedText);

        } catch (BadLocationException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("remove...");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("changed...");
    }

}
