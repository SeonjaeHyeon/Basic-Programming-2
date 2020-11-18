// Exercise 9-5

import javax.swing.*;
import java.awt.*;

class CGridFrame2 extends JFrame {
    public CGridFrame2() {
        Color[] colors = {
            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY,
            Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK,
            Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA
        };

        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 4);
        Container c = getContentPane();
        c.setLayout(grid);

        for(int i = 0; i < 16; i++) {
            JLabel lab = new JLabel(Integer.toString(i));
            lab.setOpaque(true);  // JLabel은 기본적으로 투명하므로, 불투명하도록 설정
            lab.setBackground(colors[i]);
            c.add(lab);
        }

        setSize(500, 200);
        setVisible(true);
    }
}

public class ch9exercise5 {
    public static void main(String[] args) {
        new CGridFrame2();
    }
}
