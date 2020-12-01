// 60201716 현선재

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame {
	private JLabel lb = new JLabel("count = 0");
	private int count = 0;
	
	public Test2() {
		setTitle("Counter 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.add(lb);
		c.addKeyListener(new MyKeyListener());
		
		lb.setBounds(80, 60, 100, 20);
		lb.setFont(new Font("Arial", Font.PLAIN, 15));
		
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	private class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				count++;
				lb.setText("count = " + count);
			}
			else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				count--;
				lb.setText("count = " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2();
	}

}
