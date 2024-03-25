/*
 * 상, 하, 좌, 우 키를 이용하여 "HELLO" 문자열을 움직이는 응용프로그램을 작성하라.
  "HELLO" 문자열은 JLabel 컴포넌트로 만들어 컨텐트팬에 부착하고 상, 하, 좌, 우 키를 움직이면 
    키 방향으로 한 번에 10픽셀씩 움직인다. 이를 위해 컨텐트팬의 배치관리자를 삭제하여야한다. 
  "HELLO" 문자열을 초기에 (50, 50) 위치에 출력하라.
   */

package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $08_FlyingTextEx extends JFrame{
	private JLabel label = new JLabel("HELLO");
	
	public $08_FlyingTextEx() {
		setTitle("FlyingText 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		label.setLocation(50,50);
		label.setSize(100,20);
		c.add(label);
		
		c.addKeyListener(new MyKeyListener());
		
		setSize(500,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{ 
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP :
				label.setLocation(label.getX(), label.getY()-10);	break;
			case KeyEvent.VK_DOWN :
				label.setLocation(label.getX(), label.getY()+10);	break;
			case KeyEvent.VK_LEFT :
				label.setLocation(label.getX()-10, label.getY());	break;
			case KeyEvent.VK_RIGHT :
				label.setLocation(label.getX()+10, label.getY());	break;	}}
	}
	
	public static void main(String[] args) {
		new $08_FlyingTextEx();
	}

}
