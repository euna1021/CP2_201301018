package testFrame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TestFrame1 extends JFrame {
	
	JPanel p1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame1 frame = new TestFrame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TestFrame1() {
		
		// JPanel 객체 생성
		p1 = new JPanel();
		// 결과화면 위치 설정
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마일을 킬로미터로 변환");
		
		// BoxLayout - 일렬로 배치
		// Y축으로 일렬로 배치
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		
		//JPanel 객체 생성
		JPanel input = new JPanel();
		JLabel label1 = new JLabel("거리를 마일 단위로 입력하시오.");
		
		// 텍스트 필드 크기 5로 생성
		JTextField text = new JTextField(5);
		// text는 1로 설정
		text.setText("1");
		//텍스트 오른쪽 정렬
		text.setHorizontalAlignment(JTextField.RIGHT);
		// 라벨과 텍스트필드를 넣음
		input.add(label1);
		input.add(text);
		// 화면 가운데 오도록 정렬
		input.setAlignmentX(CENTER_ALIGNMENT);
		p1.add(input);
		
		// 버튼
		JPanel input2 = new JPanel();
		JButton bt = new JButton("변환");
		// 버튼 중앙정렬
		bt.setAlignmentX(CENTER_ALIGNMENT);
		input2.add(bt);
		p1.add(input2);		
		
		JPanel input3 = new JPanel();
		JTextField text2 = new JTextField(15);
		text2.setText("1 마일은 1.6 킬로미터입니다.");
		// 텍스트 중앙 정렬
		text2.setHorizontalAlignment(JTextField.CENTER);
		// 텍스트필드 중앙정렬
		text.setAlignmentX(Component.CENTER_ALIGNMENT);
		input3.add(text2);
		p1.add(input3);
		
		add(p1);
		setVisible(true);
		
	}
}
