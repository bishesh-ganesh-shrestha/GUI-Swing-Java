package testingButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    private JButton btn1;
    private JButton btn2;
    
    public ButtonFrame(){
        super("Nikil is ?");
        setLayout(new FlowLayout());
        
        btn1 = new JButton("Gay");
        add(btn1);
        
        btn2 = new JButton("Lesbian");
        add(btn2);
        
        ButtonHandler handler = new ButtonHandler();
        btn1.addActionListener(handler);
        btn2.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string = "";
            if(event.getSource() == btn1)
                string = String.format("Nikil is %s", event.getActionCommand());
            else if(event.getSource() == btn2)
                string = String.format("Nikil is %s", event.getActionCommand());
            else
                string = String.format("Nikil does not exist.");
            
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
