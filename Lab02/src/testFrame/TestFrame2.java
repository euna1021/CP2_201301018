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
		// JPanel��ü ����
		p1 = new JPanel();
		// ȭ�� ��ġ ����
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ����");
		
		// BoxLayout - �Ϸķ� ��ġ
		// Y������ �Ϸķ� ��ġ
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		// ��
		JLabel label1 = new JLabel("������ �Է��Ͻÿ�");
		// �󺧳ֱ�
		panel1.add(label1);
		// �ؽ�Ʈ �ʵ� ũ�� 5 ����
		JTextField text1 = new JTextField(5);
		// �ؽ�Ʈ ������ ����
		text1.setHorizontalAlignment(JTextField.RIGHT);
		text1.setText("1000");
		// �ؽ�Ʈ �ʵ� �ֱ�
		panel1.add(text1);
		p1.add(panel1);
		
		
		JPanel panel2 = new JPanel();
		// ��
		JLabel label2 = new JLabel("������ �Է��Ͻÿ�");
		// �� �ֱ�
		panel1.add(label2);
		// �ؽ�Ʈ �ʵ� ũ��5 ����
		JTextField text2 = new JTextField(5);
		// �ؽ�Ʈ ������ ����
		text2.setHorizontalAlignment(JTextField.RIGHT);
		text2.setText("7.5");
		// �ؽ�Ʈ �ʵ� �ֱ�
		panel1.add(text2);
		p1.add(panel2);
		
		// ��ư
		JPanel panel3 = new JPanel();
		JButton button1 = new JButton("��ȯ");
		panel3.add(button1);
		p1.add(panel3);
		
		// �ؽ�Ʈ �ʵ�
		JPanel panel4 = new JPanel();
		JTextField text3 = new JTextField(15);
		// �ؽ�Ʈ �߾� ����
		text3.setHorizontalAlignment(JTextField.CENTER);
		text3.setText("���ڴ� �� 75���� �Դϴ�.");
		// �ֱ�
		panel4.add(text3);
		p1.add(panel4);
		
		add(p1);
		setVisible(true);
		
	}

}
