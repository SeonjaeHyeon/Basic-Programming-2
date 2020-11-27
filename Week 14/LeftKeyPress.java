// 60201716 현선재

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftKeyPress extends JFrame {
	private JLabel lb = new JLabel("Love Java");
	
	LeftKeyPress() {
		setTitle("Left 키로 문자열 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(lb);
		c.addKeyListener(new MyKeyListener());
		
		lb.setFont(new Font("Arial", Font.BOLD, 17));
		
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	private class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				StringBuffer sb = new StringBuffer(lb.getText());
				lb.setText(sb.reverse().toString());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LeftKeyPress();
	}

}
