// 60201716 현선재

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    public BorderLayoutEx() {
        String[] names = {"Calculate", "Add", "Sub", "Mul", "Div"};
        JButton[] button = new JButton[names.length];
        Color[] colors = {Color.CYAN, Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN};
        String[] borders = {BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST};

        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(30, 20));

        for(int i = 0; i < names.length; i++) {
            button[i] = new JButton(names[i]);
            button[i].setBackground(colors[i]);

            c.add(button[i], borders[i]);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new BorderLayoutEx();
    }

}
