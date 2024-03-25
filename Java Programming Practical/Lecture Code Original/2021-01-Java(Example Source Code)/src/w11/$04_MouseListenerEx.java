/*
 마우스로 문자열 이동시키기 - 마우스 이벤트 연습 
 컨텐트팬의 아무 위치에 마우스 버튼을 누르면 마우스 포인트가 있는 위치로 
 "hello" 문자열을 옮기는 스윙 응용프로그램을 작성하라
 
 내부 클래스로 구현 
 */


package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $04_MouseListenerEx extends JFrame{
	private JLabel label = new JLabel("Hello!");
	
	public $04_MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		label.setSize(50,20);
		label.setLocation(30,30);
		c.add(label);
		
		setSize(500,500);
		setVisible(true);
	}
	
	private class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new $04_MouseListenerEx();
	}
}
