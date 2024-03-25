// 다음 그림과 같이 컨텐트팬의 배경색을 오렌지색으로 하고
//이곳에 OK, Cancel, Ignore 버튼들을 부착한 스윙 프로그램을 작성하라


package w10;

import java.awt.*;
import javax.swing.*;


public class $02_ContentPaneEx extends JFrame{
	public $02_ContentPaneEx() {
		super("ContentPan과 JFrame");
		// setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame의 닫기 버튼을 눌렀을 때 메인 스레드까지 종료되도록 하는 명령어 
	
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); 	    // 배치 관리 객체, 좌->우
	
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $02_ContentPaneEx();
	}

}
