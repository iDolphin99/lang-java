package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $05_MouseAdapterEx extends JFrame {
	private JLabel label = new JLabel("hello!");
	
	public $05_MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		label.setSize(50,20);
		label.setLocation(30,30);
		c.add(label);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new $05_MouseAdapterEx();
	}

}
