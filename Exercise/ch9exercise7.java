// Exercise 9-7

import javax.swing.*;
import java.awt.*;

class CalcNorthPanel extends JPanel {
    public CalcNorthPanel() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());

        add(new JLabel("수식입력"));
        add(new JTextField(16));
    }
}

class CalcCenterPanel extends JPanel {
    public CalcCenterPanel() {
        String[] names = {
            "0", "1", "2", "3",
            "4", "5", "6", "7",
            "8", "9", "CE", "계산",
            "+", "-", "x", "/"
        };

        setBackground(Color.WHITE);
        setLayout(new GridLayout(4, 4, 3, 3));

        for(int i = 0; i < names.length; i++) {
            JButton btn = new JButton(names[i]);

            if(i > 11) {
                btn.setOpaque(true);
                btn.setBackground(Color.CYAN);
            }
            
            add(btn);
        }
    }
}

class CalcSouthPanel extends JPanel {
    public CalcSouthPanel() {
        setBackground(Color.GREEN);
        setLayout(new FlowLayout());

        add(new JLabel("계산 결과"));
        add(new JTextField(15));
    }
}

class CalcFrame extends JFrame {
    public CalcFrame() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new CalcNorthPanel(), BorderLayout.NORTH);
        c.add(new CalcCenterPanel(), BorderLayout.CENTER);
        c.add(new CalcSouthPanel(), BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }
}

public class ch9exercise7 {
    public static void main(String[] args) {
        new CalcFrame();
    }
}
