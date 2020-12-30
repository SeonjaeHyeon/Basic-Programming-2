// Open Challenge 11

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Vector;
import java.io.File;

@SuppressWarnings("serial")
class ImageGalleryFrame extends JFrame {
    private JLabel label;

    private JButton imgBtn1;
    private JButton imgBtn2;

    private Vector<ImageIcon> images;
    private ImageIcon [] icons = new ImageIcon[2];
    private int index = 0;
    
    ImageGalleryFrame() {
        setTitle("Open Challenge 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        c.add(label, BorderLayout.CENTER);

        loadImage();
        label.setIcon(images.get(index));

        c.add(new MenuPanel(), BorderLayout.SOUTH);

        imgBtn1.setIcon(icons[0]);
        imgBtn2.setIcon(icons[1]);

        MyActionListener listener = new MyActionListener();

        imgBtn1.addActionListener(listener);
        imgBtn2.addActionListener(listener);

        setSize(300, 400);
        setVisible(true);
    }

    private class MenuPanel extends JPanel {
        MenuPanel() {
            setBackground(Color.GRAY);

            imgBtn1 = new JButton();
            imgBtn2 = new JButton();

            add(imgBtn1);
            add(imgBtn2);
        }
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            if (source == imgBtn1) {
                if (index == 0) {
                    index = images.size() - 1;
                }
                else {
                    index--;
                }
            }
            else {
                if (index == images.size() - 1) {
                    index = 0;
                }
                else {
                    index++;
                }
            }

            label.setIcon(images.get(index));
        }
    }

    private void loadImage() {
        File f = new File("images/");
        File [] fList = f.listFiles();
        images = new Vector<ImageIcon>();
        
        int i = 0;
        for (File e: fList) {
            if (e.isDirectory()) {
                continue;
            }
            else if (e.getName().endsWith(".png")) {  // 화살표 이미지는 PNG이고, 나머지는 JPG이다.
                icons[i++] = new ImageIcon(e.getAbsolutePath());
                continue;
            }

            images.add(new ImageIcon(e.getAbsolutePath()));
        }
    }
}

public class ch11challenge {
    public static void main(String[] args) {
        new ImageGalleryFrame();
    }
}
