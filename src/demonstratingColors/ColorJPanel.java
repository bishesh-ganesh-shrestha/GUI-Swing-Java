package demonstratingColors;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(new Color(255,0,0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 40);
        g.setColor(new Color(0.5f, 0.75f, 0.0f));
        g.fillRect(15, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 65);
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 90);
        g.fillRect(15, 100, 100, 20);
        g.drawString("Current RGB: " + g.getColor().getRed()+", "+g.getColor().getGreen()+", "+g.getColor().getBlue(), 130, 115);
    }
}
