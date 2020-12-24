// Exercise 11-8

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.File;
import java.util.Vector;

@SuppressWarnings("serial")  // 직렬화 관련 문제 해결: https://stackoverflow.com/q/285793
class ImageGalleryPracticeFrame extends JFrame {
    private JRadioButton radio1;
    private JRadioButton radio2;
    private ButtonGroup group;

    private JLabel label;
    private Vector<ImageIcon> icons;
    private int index = 0;
    
    ImageGalleryPracticeFrame() {
        setTitle("Image Gallery Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        radio1 = new JRadioButton("left", true);
        radio2 = new JRadioButton("right", false);

        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        c.add(new NorthPanel(), BorderLayout.NORTH);

        label = new JLabel();
        c.add(label, BorderLayout.CENTER);

        loadIcon();
        label.setIcon(icons.get(index));

        label.addMouseListener(new MyMouseListener());

        setSize(600, 400);
        setVisible(true);
    }

    private class NorthPanel extends JPanel {
        NorthPanel() {
            add(radio1);
            add(radio2);
        }
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (radio1.isSelected()) {
                if (index == 0) {
                    index = icons.size() - 1;
                }
                else {
                    index--;
                }
            }
            else {
                if (index == icons.size() - 1) {
                    index = 0;
                }
                else {
                    index++;
                }
            }

            label.setIcon(icons.get(index));
        }
    }

    private void loadIcon() {
        File f = new File("images/");
        File [] fList = f.listFiles();
        icons = new Vector<ImageIcon>();

        for (File e: fList) {
            if (e.isDirectory()) {
                continue;
            }

            icons.add(new ImageIcon(e.getAbsolutePath()));
        }
    }
}

public class ch11exercise8 {
    public static void main(String[] args) {
        new ImageGalleryPracticeFrame();
    }
}
