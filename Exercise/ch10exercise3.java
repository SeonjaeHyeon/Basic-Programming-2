// Exercise 10-3

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyPressEx extends JFrame {
    private JLabel lb = new JLabel("Love Java");
    
    KeyPressEx() {
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.addKeyListener(new MyKeyListener());
        c.add(lb);

        setSize(300, 100);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                StringBuffer sb = new StringBuffer(lb.getText());
                lb.setText(sb.reverse().toString());
            }
        }
    }
}

public class ch10exercise3 {
    public static void main(String[] args) {
        new KeyPressEx();
    }    
}
