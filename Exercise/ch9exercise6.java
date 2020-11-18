// Exercise 9-6

import javax.swing.*;
import java.awt.*;

class RandomLabel extends JFrame {
    public RandomLabel() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for(int i = 0; i < 20; i++) {
            JLabel lab = new JLabel();
            int x = (int)(Math.random() * 200) + 50; // 50 ~ 250
            int y = (int)(Math.random() * 200) + 50; // 50 ~ 250

            lab.setBounds(x, y, 10, 10);
            lab.setOpaque(true);
            lab.setBackground(Color.BLUE);

            c.add(lab);
        }

        setSize(300, 300);
        setVisible(true);
    }
}

public class ch9exercise6 {
    public static void main(String[] args) {
        new RandomLabel();
    }
}
