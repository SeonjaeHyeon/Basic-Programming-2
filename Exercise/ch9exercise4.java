// Exercise 9-4

import javax.swing.*;
import java.awt.*;

class CGridFrame extends JFrame {
    public CGridFrame() {
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY};

        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);
        grid.setHgap(2);

        Container c = getContentPane();
        c.setLayout(grid);

        for(int i = 0; i < 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setBackground(colors[i]);
            c.add(btn);
        }

        setSize(500, 200);
        setVisible(true);
    }
}

public class ch9exercise4 {
    public static void main(String[] args) {
        new CGridFrame();
    }
}
