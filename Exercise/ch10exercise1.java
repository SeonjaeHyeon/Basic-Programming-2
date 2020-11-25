// Exercise 10-1

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseHoverEx extends JFrame {
    private JLabel lb = new JLabel("사랑해");

    MouseHoverEx() {
        setTitle("마우스 올리기 내리기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(null);

        lb.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                lb.setText("Love Java");
            }

            public void mouseExited(MouseEvent e) {
                lb.setText("사랑해");
            }
        });
        lb.setBounds(120, 10, 80, 20);

        c.add(lb);

        setSize(300, 200);
        setVisible(true);
    }
}

public class ch10exercise1 {
    public static void main(String[] args) {
        new MouseHoverEx();
    }
}
