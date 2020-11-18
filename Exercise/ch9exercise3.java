// Exercise 9-3

import javax.swing.*;
import java.awt.*;

class GridFrame extends JFrame {
    public GridFrame() {
        setTitle("Ten Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);
        grid.setHgap(2);

        Container c = getContentPane();
        c.setLayout(grid);

        for(int i = 0; i < 10; i++) {
            c.add(new JButton(Integer.toString(i)));
        }

        setSize(500, 200);
        setVisible(true);
    }
}

public class ch9exercise3 {
    public static void main(String[] args) {
        new GridFrame();
    }
}
