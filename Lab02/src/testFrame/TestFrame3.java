package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestFrame3 extends JFrame {

	JPanel p1;
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame3 frame = new TestFrame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TestFrame3() {
		// JPanel객체 생성
		p1 = new JPanel();
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("계산기");
		
		// FlowLayout : 컴포넌트가 삽임되는 순서대로 왼쪽에서 오른쪽으로 배치
		// -> 배치할 공간이 없으면 아래로 내려가 반복함
		// 왼쪽: FlowLayout.LEFT;
		// 창의 왼쪽: FlowLayout.LEADING (*인터넷 참고*)
		p1.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		JPanel panel1 = new JPanel();
		// 크기 20인 텍스트필드 생성
		JTextField text1 = new JTextField(20);
		// 텍스트 오른쪽 정렬
		text1.setHorizontalAlignment(JTextField.RIGHT);
		text1.setText("23");
		// 텍스트 필드 넣기 
		panel1.add(text1);
		p1.add(panel1);
		
		// GridLayout : 컨테이너를 프로그램에서 설정한 동일한  크기의 2차원 격자로 나눔
		// -> 컴포넌트는 삽입 순서대로 좌에서 우로, 다시 위에서 아래로 배치
		// GridLayout(a,b,c,d) = a*b행, 수직간격c, 수평간격 d
		JPanel panel2 = new JPanel(new GridLayout(0,4,4,4));
		// 버튼
		JButton button2 = new JButton("C");
		// 버튼은 왼쪽 정렬
		button2.setHorizontalAlignment(JButton.LEFT);
		// 버튼 넣기
		panel2.add(button2);
		p1.add(panel2);
		
		JPanel panel3 = new JPanel(new GridLayout(4,4,4,4));
		panel3.add(new JButton("7"));
		panel3.add(new JButton("8"));
		panel3.add(new JButton("9"));
		panel3.add(new JButton("/"));
		panel3.add(new JButton("4"));
		panel3.add(new JButton("5"));
		panel3.add(new JButton("6"));
		panel3.add(new JButton("*"));
		panel3.add(new JButton("1"));
		panel3.add(new JButton("2"));
		panel3.add(new JButton("3"));
		panel3.add(new JButton("-"));
		panel3.add(new JButton("0"));
		panel3.add(new JButton("+/-"));
		panel3.add(new JButton("="));
		panel3.add(new JButton("+"));

		p1.add(panel3);
		
		add(p1);
		setVisible(true);
	}

}
