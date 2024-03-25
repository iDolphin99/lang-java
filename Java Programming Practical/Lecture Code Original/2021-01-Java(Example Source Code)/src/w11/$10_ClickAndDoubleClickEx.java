// 더블 클릭할 때 마다 컨텐트팬의 배경색을 랜덤하게 변경한다. 


package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $10_ClickAndDoubleClickEx extends JFrame{
	public $10_ClickAndDoubleClickEx() {
		setTitle("Clikck and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener());
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			Container contentPane = (Container)e.getSource();
			
			if (e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				contentPane.setBackground(new Color(r,g,b));}	}	
		}
	
	public static void main(String[] args) {
		new $10_ClickAndDoubleClickEx(); 
	}
}
