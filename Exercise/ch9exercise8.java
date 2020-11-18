// Exercise 9-8

import javax.swing.*;
import java.awt.*;

class ButtonFrame extends JPanel {
    public ButtonFrame() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());

        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class LabelFrame extends JPanel {
    public LabelFrame() {
        setBackground(Color.WHITE);
        setLayout(null);

        for(int i = 0; i < 10; i++) {
            int x = (int)(Math.random() * 200) + 50;
            int y = (int)(Math.random() * 200) + 50;

            JLabel lab = new JLabel("*");
            lab.setBounds(x, y, 10, 10);;
            lab.setForeground(Color.RED);  // 글자 색 변경

            add(lab);
        }
    }
}

class FieldFrame extends JPanel {
    public FieldFrame() {
        setBackground(Color.GREEN);
        setLayout(new FlowLayout());

        add(new JButton("Word Input"));
        add(new JTextField(16));
    }
}

class SeveralFrame extends JFrame {
    public SeveralFrame() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new ButtonFrame(), BorderLayout.NORTH);
        c.add(new LabelFrame(), BorderLayout.CENTER);
        c.add(new FieldFrame(), BorderLayout.SOUTH);

        setSize(350, 350);
        setVisible(true);
    }
}

public class ch9exercise8 {
    public static void main(String[] args) {
        new SeveralFrame();
    }
}
