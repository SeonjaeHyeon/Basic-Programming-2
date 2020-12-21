// Exercise 11-5

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;  // JSlider 이벤트는 swing 패키지에 포함되어 있음

class JSliderPracticeFrame extends JFrame {
    private JSlider slider;
    private JLabel label;

    JSliderPracticeFrame() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 100);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        c.add(slider);

        slider.addChangeListener(new MyChangeListener());

        label = new JLabel("100");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setSize(50, 20);
        c.add(label);

        setSize(350, 150);
        setVisible(true);
    }

    private class MyChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider sldr = (JSlider) e.getSource();
            
            label.setText(String.valueOf(sldr.getValue()));
        }
    }
}

public class ch11exercise5 {
    public static void main(String[] args) {
        new JSliderPracticeFrame();
    }
}
