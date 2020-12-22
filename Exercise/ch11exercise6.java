// Exercise 11-6

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class TextAreaPracticeFrame extends JFrame {
    private JTextArea jta;
    private JScrollPane jsp;
    private JSlider js;
    
    TextAreaPracticeFrame() {
        setTitle("TextArea Prcatice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        jsp.setBounds(0, 0, 400, 150);
        c.add(jsp);

        jta.addKeyListener(new MyKeyListener());

        js = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        js.setMajorTickSpacing(20);
        js.setMinorTickSpacing(5);
        js.setBounds(5, 150, 375, 120);
        c.add(js);

        js.addChangeListener(new MyChangeListener());

        setSize(400, 300);
        setVisible(true);

        jta.setFocusable(true);
        jta.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            int value = jta.getText().length();

            StringBuffer sb = new StringBuffer(jta.getText());
            if (sb.length() > js.getMaximum()) {
                sb.setLength(js.getValue());
                jta.setText(sb.toString());
            }

            js.setValue(value);
        }
    }

    private class MyChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider sldr = (JSlider) e.getSource();

            int value = sldr.getValue();
            int length = jta.getText().length();

            if (value > length) {
                js.setValue(length);
                return;
            }

            StringBuffer sb = new StringBuffer(jta.getText());
            sb.setLength(sldr.getValue());

            jta.setText(sb.toString());
        }
    }
}

public class ch11exercise6 {
    public static void main(String[] args) {
        new TextAreaPracticeFrame();
    }
}
