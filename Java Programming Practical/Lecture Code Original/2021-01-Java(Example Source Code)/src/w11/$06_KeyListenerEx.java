// 다양한 KeyEvent 와 KeyListener 활용 

package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $06_KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;
	
	public $06_KeyListenerEx() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3]; 
		keyMessage[0] = new JLabel(" getKeyCode()");
		keyMessage[1] = new JLabel(" getKeyChar()");
		keyMessage[2] = new JLabel(" getKeyText()");
		
		for (int i=0; i<3; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);			 // 컴포넌트의 바탕색이 보이게 하기 위한 불투명도 조절 
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(500,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}
	
	public static void main(String[] args) {
		new $06_KeyListenerEx();
	}

}
