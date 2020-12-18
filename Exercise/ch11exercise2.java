// Exercise 11-2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JTextFieldComboBoxFrame extends JFrame {
    private JTextField txtfld = new JTextField("", 15);
    private JComboBox<String> cmbbox = new JComboBox<String>();
    
    JTextFieldComboBoxFrame() {
        setTitle("JTextField and JComboBox Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(txtfld);
        c.add(cmbbox);

        txtfld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();

                cmbbox.addItem(t.getText());
                t.setText("");  // JTextField 입력 창 초기화
            }
        });

        setSize(300, 200);
        setVisible(true);
    }
}

public class ch11exercise2 {
    public static void main(String[] args) {
        new JTextFieldComboBoxFrame();
    }
}
