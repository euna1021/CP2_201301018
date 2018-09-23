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
		// JPanel��ü ����
		p1 = new JPanel();
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����");
		
		// FlowLayout : ������Ʈ�� ���ӵǴ� ������� ���ʿ��� ���������� ��ġ
		// -> ��ġ�� ������ ������ �Ʒ��� ������ �ݺ���
		// ����: FlowLayout.LEFT;
		// â�� ����: FlowLayout.LEADING (*���ͳ� ����*)
		p1.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		JPanel panel1 = new JPanel();
		// ũ�� 20�� �ؽ�Ʈ�ʵ� ����
		JTextField text1 = new JTextField(20);
		// �ؽ�Ʈ ������ ����
		text1.setHorizontalAlignment(JTextField.RIGHT);
		text1.setText("23");
		// �ؽ�Ʈ �ʵ� �ֱ� 
		panel1.add(text1);
		p1.add(panel1);
		
		// GridLayout : �����̳ʸ� ���α׷����� ������ ������  ũ���� 2���� ���ڷ� ����
		// -> ������Ʈ�� ���� ������� �¿��� ���, �ٽ� ������ �Ʒ��� ��ġ
		// GridLayout(a,b,c,d) = a*b��, ��������c, ���򰣰� d
		JPanel panel2 = new JPanel(new GridLayout(0,4,4,4));
		// ��ư
		JButton button2 = new JButton("C");
		// ��ư�� ���� ����
		button2.setHorizontalAlignment(JButton.LEFT);
		// ��ư �ֱ�
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
