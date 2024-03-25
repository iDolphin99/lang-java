/*
 수평 간격이 30, 수직 간격을 40픽셀로 하고 LEFT로 정렬 배치하는 FlowLayout 배치관리자를 가진 
 컨텐트팬에 5개의 버튼 컴포넌트를 부착한 스윙 응용프로그램을 작성하라.
 */
package w10;

import java.awt.*;
import javax.swing.*;

public class $03_FlowLayoutEx extends JFrame {
	public $03_FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		c.add(new Button("add"));
		c.add(new Button("sub"));
		c.add(new Button("mul"));
		c.add(new Button("div"));
		c.add(new Button("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $03_FlowLayoutEx();

	}

}
