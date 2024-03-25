package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $03_AnonymousClassListener extends JFrame {
	public $03_AnonymousClassListener() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		
		// 익명 클래스로 이벤트 리스너를 등록해주자 
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else 
					b.setText("Action");
				setTitle(b.getText());}
		});
		c.add(btn);
		
		
		setSize(350,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new $03_AnonymousClassListener();	
		}
}
