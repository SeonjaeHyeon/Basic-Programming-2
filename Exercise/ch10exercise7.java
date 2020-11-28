// Exercise 10-7

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ScrollEx extends JFrame {
    private JLabel lb = new JLabel("Love Java");
    
    ScrollEx() {
        setTitle("마우스 휠을 굴려 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(lb);
        
        lb.setFont(new Font("Arial", Font.BOLD, 15));
        lb.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                int n = e.getWheelRotation();
                Font f = lb.getFont();
                int size = f.getSize();

                if(n < 0) {
                    if(size == 5) {
                        return;
                    }

                    lb.setFont(new Font("Arial", Font.BOLD, size - 5));
                }
                else {
                    lb.setFont(new Font("Arial", Font.BOLD, size + 5));
                }
            }
        });

        setSize(400, 200);
        setVisible(true);
    }
}

public class ch10exercise7 {
    public static void main(String[] args) {
        new ScrollEx();
    }
}
