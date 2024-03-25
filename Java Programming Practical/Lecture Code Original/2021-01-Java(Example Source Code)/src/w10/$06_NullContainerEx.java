package w10;

import java.awt.*;
import javax.swing.*;

public class $06_NullContainerEx extends JFrame {
	public $06_NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		
		for (int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);}
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $06_NullContainerEx();
	}

}
