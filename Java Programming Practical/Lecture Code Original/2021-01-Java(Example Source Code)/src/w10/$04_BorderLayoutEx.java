/*
 BorderLayout 배치관리자를 사용하여 컨텐트팬에 다음과 같이 5개의 버튼 컴포넌트를 삽입하라.
 */


package w10;

import java.awt.*;
import javax.swing.*;

public class $04_BorderLayoutEx extends JFrame{
	public $04_BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30,20));
		
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $04_BorderLayoutEx();
	}

}
