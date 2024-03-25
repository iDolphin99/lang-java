package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $02_InnerClassListener extends JFrame{
	public $02_InnerClassListener() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	// Action 리스너를 내부 클래스로 작성
	// private로 선언하여 해당 클래스 외부에서 사용할 수 없게 함 
	// 리스너 안에서도 해당 클래스의 멤버에 대한 접근을 용이하게 함 
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { 
			JButton b = (JButton)e.getSource();
			
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			$02_InnerClassListener.this.setTitle(b.getText());}
	}
	
	public static void main(String[] args) {
		new $02_InnerClassListener();
	}

}
