package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $07_KeyCodeEx extends JFrame{
	private JLabel label = new JLabel();
	
	public $07_KeyCodeEx () {
		setTitle("KeyCode ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
	
		c.addKeyListener(new MyKeyListener());
		c.add(label);
		
		setSize(500,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			label.setText(e.getKeyText(e.getKeyCode()));
			
			Container contentPane = (Container)e.getSource();
			
			if (e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);		}
	}
	
	public static void main(String[] args) {
		new $07_KeyCodeEx();
	}

}
