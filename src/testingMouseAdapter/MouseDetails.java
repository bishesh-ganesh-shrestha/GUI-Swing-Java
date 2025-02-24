package testingMouseAdapter;

import javax.swing.JFrame;

public class MouseDetails {
    public static void main(String[] args) {
        MouseDetailsFrame mdf = new MouseDetailsFrame();
        mdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mdf.setSize(400,150);
        mdf.setVisible(true);
    }
}
