import java.util.ArrayList;

public class Row {
    private ArrayList<Column> columns = new ArrayList<Column>();

    public Row() {
        return;
    }

    public Row(String text) {
        String[] splitText = text.split("|");
        for(String s: splitText) {
            columns.add(new Column(s));
        }
    }

    public ArrayList<Column> getColumns() {
        return this.columns;
    }

    @Override
    public String toString() {
        String result = "";

        for(Column column: this.columns) {
            result += column.getText();
        }

        return result; 
    }

}
