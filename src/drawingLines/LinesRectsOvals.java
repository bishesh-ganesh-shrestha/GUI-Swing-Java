package drawingLines;

import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LinesRectsOvalsJPanel lro = new LinesRectsOvalsJPanel();
        lro.setBackground(Color.WHITE);
        frame.add(lro);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }
}
