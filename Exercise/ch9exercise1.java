// Exercise 9-1

import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Let's study Java");
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class ch9exercise1 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
