package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class TestFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	JPanel p1;
	private JTextField text1;
	private JTextField text2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame2 frame = new TestFrame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TestFrame2() {
		// JPanel객체 생성
		p1 = new JPanel();
		// 화면 위치 설정
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		
		// BoxLayout - 일렬로 배치
		// Y축으로 일렬로 배치
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		// 라벨
		JLabel label1 = new JLabel("원금을 입력하시오");
		// 라벨넣기
		panel1.add(label1);
		// 텍스트 필드 크기 5 생성
		JTextField text1 = new JTextField(5);
		// 텍스트 오른쪽 정렬
		text1.setHorizontalAlignment(JTextField.RIGHT);
		text1.setText("1000");
		// 텍스트 필드 넣기
		panel1.add(text1);
		p1.add(panel1);
		
		
		JPanel panel2 = new JPanel();
		// 라벨
		JLabel label2 = new JLabel("이율을 입력하시오");
		// 라벨 넣기
		panel1.add(label2);
		// 텍스트 필드 크기5 생성
		JTextField text2 = new JTextField(5);
		// 텍스트 오른쪽 정렬
		text2.setHorizontalAlignment(JTextField.RIGHT);
		text2.setText("7.5");
		// 텍스트 필드 넣기
		panel1.add(text2);
		p1.add(panel2);
		
		// 버튼
		JPanel panel3 = new JPanel();
		JButton button1 = new JButton("변환");
		panel3.add(button1);
		p1.add(panel3);
		
		// 텍스트 필드
		JPanel panel4 = new JPanel();
		JTextField text3 = new JTextField(15);
		// 텍스트 중앙 정렬
		text3.setHorizontalAlignment(JTextField.CENTER);
		text3.setText("이자는 연 75만원 입니다.");
		// 넣기
		panel4.add(text3);
		p1.add(panel4);
		
		add(p1);
		setVisible(true);
		
	}

}
