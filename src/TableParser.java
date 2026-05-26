import java.util.ArrayList;

public class TableParser {

    private String parsedText;

    public TableParser() {
        return;
    }

    public TableParser(String text) {
        parsedText = "";

        boolean headerSet = false;

        String[] lines = text.split("\n");

        for(String line: lines) {
            Row row = new Row(line);

            parsedText += "| ";
            parsedText += row.toString();
            parsedText += "| ";
            parsedText += "\n";

            if(!headerSet) {
                parsedText += "| ---- |\n";
                headerSet = true;
            }
        }
    }

    public String getParsedText() {
        return this.parsedText;
    }
    
}
