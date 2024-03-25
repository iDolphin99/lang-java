package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $01_IndepClassListener extends JFrame{
	// 생성자 메서드 
	public $01_IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 버튼 생성하고 이벤트 달아주기 
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $01_IndepClassListener();}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else 
			b.setText("Action");
	}
}
