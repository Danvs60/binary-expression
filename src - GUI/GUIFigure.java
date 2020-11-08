import javax.swing.*;

public class GUIFigure extends AbstractFigure {
    private JTextArea area;

    public GUIFigure() {
        super();
    }

    public void setTextArea(JTextArea x) {
        area = x;
    }

    @Override
    void printFigure() {
        area.setText(toString());
    }

    @Override
    public void invert() {
        super.invert();
        printFigure();
    }
}
