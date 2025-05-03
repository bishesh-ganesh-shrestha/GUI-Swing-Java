package examPrac1;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MouseEventFrame extends JFrame {
    public MouseEventFrame() {
        super("Calculation with Mouse Event");
        setLayout(new FlowLayout());

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField result = new JTextField(10);
        result.setEditable(false); // prevent editing the result field

        add(textField1);
        add(textField2);
        add(result);

        // Mouse listener is added to the result field
        result.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    result.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
            
            public void mouseReleased(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 - num2;
                    result.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }

            
        });
    }

    public static void main(String[] args) {
        MouseEventFrame frame = new MouseEventFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
