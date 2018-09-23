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
		
		// JPanel ��ü ����
		p1 = new JPanel();
		// ���ȭ�� ��ġ ����
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������ ų�ι��ͷ� ��ȯ");
		
		// BoxLayout - �Ϸķ� ��ġ
		// Y������ �Ϸķ� ��ġ
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		
		//JPanel ��ü ����
		JPanel input = new JPanel();
		JLabel label1 = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�.");
		
		// �ؽ�Ʈ �ʵ� ũ�� 5�� ����
		JTextField text = new JTextField(5);
		// text�� 1�� ����
		text.setText("1");
		//�ؽ�Ʈ ������ ����
		text.setHorizontalAlignment(JTextField.RIGHT);
		// �󺧰� �ؽ�Ʈ�ʵ带 ����
		input.add(label1);
		input.add(text);
		// ȭ�� ��� ������ ����
		input.setAlignmentX(CENTER_ALIGNMENT);
		p1.add(input);
		
		// ��ư
		JPanel input2 = new JPanel();
		JButton bt = new JButton("��ȯ");
		// ��ư �߾�����
		bt.setAlignmentX(CENTER_ALIGNMENT);
		input2.add(bt);
		p1.add(input2);		
		
		JPanel input3 = new JPanel();
		JTextField text2 = new JTextField(15);
		text2.setText("1 ������ 1.6 ų�ι����Դϴ�.");
		// �ؽ�Ʈ �߾� ����
		text2.setHorizontalAlignment(JTextField.CENTER);
		// �ؽ�Ʈ�ʵ� �߾�����
		text.setAlignmentX(Component.CENTER_ALIGNMENT);
		input3.add(text2);
		p1.add(input3);
		
		add(p1);
		setVisible(true);
		
	}
}
