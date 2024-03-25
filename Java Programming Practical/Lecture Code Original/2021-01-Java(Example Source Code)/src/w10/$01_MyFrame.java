// 300x300 크기의 스윙 프레임을 작성하라. 


package w10;

import javax.swing.*;

public class $01_MyFrame extends JFrame{
	// 생성자 메소드 
	// JFrame이 제공하는 메소드 사용  
	public $01_MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		$01_MyFrame frame = new $01_MyFrame(); 
	}
}
