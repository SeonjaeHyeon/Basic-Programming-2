// Exercise 11-3

import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;

class MoneyChanger extends JFrame {
    private JTextField money = new JTextField("", 15);
    private JButton calc = new JButton("계산");

    private JTextField [] values = new JTextField[8];

    MoneyChanger() {
        setTitle("Money Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);

        setSize(350, 300);
        setVisible(true);
    }

    private class NorthPanel extends JPanel {
        NorthPanel() {
            setLayout(new FlowLayout());
            setBackground(Color.PINK);
    
            add(new JLabel("금액"));
            add(money);
            add(calc);

            calc.addActionListener(new BtnActionListener());
        }
    }
    
    private class CenterPanel extends JPanel {
        CenterPanel() {
            String [] labs = {
                "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"
            };

            setLayout(null);
            setBackground(Color.PINK);

            for(int i = 0; i < labs.length; i++) {
                JLabel lb = new JLabel(labs[i]);
                lb.setBounds(60, 5 + i * 20, 50, 20);
                lb.setHorizontalAlignment(JLabel.RIGHT);

                add(lb);

                values[i] = new JTextField("");
                values[i].setBounds(130, 5 + i * 20, 80, 20);
                values[i].setHorizontalAlignment(JTextField.CENTER);

                add(values[i]);
            }
        }
    }

    private class BtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int [] nums = {
                50000, 10000, 1000, 500, 100, 50, 10, 1
            };

            int total = 0;
            try {
                total = Integer.parseInt(money.getText());
            } catch (InputMismatchException exp) {
                System.out.println("자료형 오류");
                return;
            } 
            catch (Exception exp) {
                System.out.println(exp.toString());
                return;
            }

            int quotient;
            for(int i = 0; i < nums.length; i++) {
                quotient = total / nums[i];
                total = total % nums[i];

                values[i].setText(String.valueOf(quotient));
            }
        }
    }
}

public class ch11exercise3 {
    public static void main(String[] args) {
        new MoneyChanger();
    }
}
