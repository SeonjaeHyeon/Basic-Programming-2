// Exercise 10-6

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseClickEx extends JFrame {
    private JLabel lb = new JLabel("C");
    
    MouseClickEx() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        c.add(lb);
        lb.addMouseListener(new MyMouseListener());

        lb.setLocation(100, 100);
        lb.setSize(15, 15);

        setSize(400, 400);
        setVisible(true);
    }

    private class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = (int)(Math.random() * 375);
            int y = (int)(Math.random() * 375);

            lb.setLocation(x, y);
        }
    }
}

public class ch10exercise6 {
    public static void main(String[] args) {
        new MouseClickEx();
    }
}
