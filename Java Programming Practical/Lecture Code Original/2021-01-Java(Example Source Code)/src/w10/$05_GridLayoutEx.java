/*
 아래 화면과 같이 사용자로부터 입력받는 폼을 
 스윙 응용프로그램을 작성하라
 */

package w10;

import java.awt.*;
import javax.swing.*;

public class $05_GridLayoutEx extends JFrame{
	public $05_GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $05_GridLayoutEx();
	}

}
