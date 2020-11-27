// Exercise 10-5

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FontSizeEx extends JFrame {
    private JLabel lb = new JLabel("Love Java");
    
    FontSizeEx() {
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        lb.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(lb);
        c.addKeyListener(new MyKeyListener());

        setSize(350, 200);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == '+') {
                Font f = lb.getFont();
                int size = f.getSize();
                lb.setFont(new Font("Arial", Font.PLAIN, size + 5));
            }
            else if(e.getKeyChar() == '-') {
                Font f = lb.getFont();
                int size = f.getSize();
                lb.setFont(new Font("Arial", Font.PLAIN, size - 5));
            }
        }
    }
}

public class ch10exercise5 {
    public static void main(String[] args) {
        new FontSizeEx();
    }
}
