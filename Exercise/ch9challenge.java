// Open Challenge 9

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());

        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Close"));
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);

        JLabel lab1 = new JLabel("Hello");
        JLabel lab2 = new JLabel("Java");
        JLabel lab3 = new JLabel("Love");

        lab1.setBounds(100, 10, 50, 20);
        lab2.setBounds(30, 150, 50, 20);
        lab3.setBounds(200, 120, 50, 20);

        add(lab1);
        add(lab2);
        add(lab3);
    }
}

class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }
}

public class ch9challenge {
    public static void main(String[] args) {
        new MainFrame();
    }    
}
