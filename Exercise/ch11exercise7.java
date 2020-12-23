// Exercise 11-7

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class JSliderPracticeFrame2 extends JFrame {
    private JSlider slider;
    private JLabel label;
    
    JSliderPracticeFrame2() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        slider = new JSlider(JSlider.HORIZONTAL, 1, 100, 20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        c.add(slider, BorderLayout.NORTH);

        label = new JLabel("I Love Java");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, slider.getValue()));
        c.add(label, BorderLayout.CENTER);

        slider.addChangeListener(new MyChangeListener());

        setSize(550, 300);
        setVisible(true);
    }

    private class MyChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider sldr = (JSlider) e.getSource();

            label.setFont(new Font("Arial", Font.PLAIN, sldr.getValue()));
        }
    }
}

public class ch11exercise7 {
    public static void main(String[] args) {
        new JSliderPracticeFrame2();
    }
}
