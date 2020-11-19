// 60201716 현선재

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.GRAY);
        setLayout(new FlowLayout());

        add(new JLabel("수식 입력"));
        add(new JTextField(17));
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        String[] names = {"CE", "계산", "+", "-", "x", "/"};

        setLayout(new GridLayout(4, 4));

        for(int i = 0; i < 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setBackground(Color.WHITE);

            add(btn);
        }

        for(int i = 0; i < names.length; i++) {
            JButton btn = new JButton(names[i]);
            btn.setBackground(Color.CYAN);

            add(btn);
        }
    }
}

class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        setLayout(new FlowLayout());

        add(new JLabel("계산결과"));
        add(new JTextField(17));
    }
}

public class MyCalc extends JFrame {
    public MyCalc() {
        JPanel[] panels = {new NorthPanel(), new CenterPanel(), new SouthPanel()};
        String[] borders = {BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH};

        setTitle("나의 계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        for(int i = 0; i < panels.length; i++) {
            c.add(panels[i], borders[i]);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MyCalc();
    }

}
