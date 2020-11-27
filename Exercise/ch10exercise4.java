// Exercise 10-4

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyPressEx2 extends JFrame {
    private JLabel lb = new JLabel("Love Java");
    
    KeyPressEx2() {
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(lb);
        c.addKeyListener(new MyKeyListener());

        setSize(300, 100);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                String text = lb.getText();
                lb.setText(text.substring(1) + text.substring(0, 1));
            }
        }
    }
}

public class ch10exercise4 {
    public static void main(String[] args) {
        new KeyPressEx2();
    }
}
