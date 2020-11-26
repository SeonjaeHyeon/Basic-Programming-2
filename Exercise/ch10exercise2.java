// Exercise 10-2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseDragEx extends JFrame {
    MouseDragEx() {
        setTitle("드래깅 동안 YELLOW로 배경색 변경 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        setSize(300, 200);
        setVisible(true);
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }
}

public class ch10exercise2 {
    public static void main(String[] args) {
        new MouseDragEx();
    }
}
