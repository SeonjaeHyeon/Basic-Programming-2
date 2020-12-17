// Exercise 11-1

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckBoxPracticeFrame extends JFrame {
    private JCheckBox [] checks = {
        new JCheckBox("버튼 비활성화"),
        new JCheckBox("버튼 감추기")
    };
    private JButton btn = new JButton("test button");
    
    CheckBoxPracticeFrame() {
        setTitle("CheckBox Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyItemListener listener = new MyItemListener();
        for(int i = 0; i < checks.length; i++) {
            c.add(checks[i]);
            checks[i].addItemListener(listener);
        }

        c.add(btn);

        setSize(300, 150);
        setVisible(true);
    }

    private class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED) {
                if(e.getItem() == checks[0]) {
                    btn.setEnabled(false);
                }
                else {
                    btn.setVisible(false);
                }
            }
            else {
                if(e.getItem() == checks[0]) {
                    btn.setEnabled(true);
                }
                else {
                    btn.setVisible(true);
                }
            }
        }
    }
}

public class ch11exercise1 {
    public static void main(String[] args) {
        new CheckBoxPracticeFrame();
    }
}
