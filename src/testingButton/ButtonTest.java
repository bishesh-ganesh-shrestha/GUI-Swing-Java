package testingButton;

import javax.swing.JFrame;

public class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame btnFrame = new ButtonFrame();
        btnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnFrame.setSize(350,100);
        btnFrame.setVisible(true);
    }
}