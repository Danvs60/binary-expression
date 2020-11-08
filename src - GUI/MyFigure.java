import javax.swing.*;
import java.awt.*;

public class MyFigure extends JFrame {
    private JButton invert;
    private JTextArea canvas;
    private GUIFigure guif;

    public MyFigure() {
        super("Mu figure class");
        guif = new GUIFigure();
        guif.setPred((x, y) -> x == 1 || x == 7 || y == 1 || y == 7);
        invert = new JButton("Invert");
        invert.addActionListener(e -> guif.invert());
        canvas = new JTextArea(7, 7);
        guif.setTextArea(canvas);
        guif.printFigure();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(canvas, BorderLayout.NORTH);
        add(invert, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFigure a = new MyFigure();
    }
}
