// Open Challenge 10

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomNumEx extends JFrame {  
    RandomNumEx() {
        setTitle("Open Challenge 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel());
        Container g = getContentPane();

        setSize(300, 200);
        setVisible(true);

        g.setFocusable(true);
        g.requestFocus();
    }

    private class GamePanel extends JPanel {
        private JLabel[] lb = new JLabel[3];
        private JLabel lb2 = new JLabel("시작합니다.");

        public GamePanel() {
            setLayout(null);

            for(int i = 0; i < lb.length; i++) {
                lb[i] = new JLabel("0");
                lb[i].setOpaque(true);
                lb[i].setBackground(Color.MAGENTA);
                lb[i].setForeground(Color.YELLOW);
                lb[i].setFont(new Font("Arial", Font.ITALIC, 30));
                lb[i].setBounds(i * 80 + 30, 50, 60, 30);
                lb[i].setHorizontalAlignment(JLabel.CENTER);  // 글자 위치 가운데 정렬
                
                add(lb[i]);
            }
    
            lb2.setBounds(100, 20, 100, 200);
            add(lb2);

            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyChar() == '\n') {
                        for(int i = 0; i < lb.length; i++) {
                            int x = (int)(Math.random() * 5);
                            lb[i].setText(String.valueOf(x));
                        }

                        String s = lb[0].getText();
                        for(int i = 0; i < lb.length; i++) {
                            if(s.equals(lb[i].getText())) {
                                s = lb[i].getText();
                                
                                if(i == lb.length - 1) {
                                    lb2.setText("축하합니다!");
                                    break;
                                }

                                continue;
                            }
                            
                            lb2.setText("아쉽군요!");
                            break;
                        }
                    }
                }
            });
        }
    }
}

public class ch10challenge {
    public static void main(String[] args) {
        new RandomNumEx();
    }
}
