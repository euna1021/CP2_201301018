package lab01;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ù ��° ��� ���
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		int num1 = scanner.nextInt();
		System.out.println("---[1��]---");	
		if(num1>0) {
			for(int i=0; i<num1; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}else { // ����ó��(�Է¹��� ���� 0���� �� ��, �⺻�� 5�� ����)
			for(int i=0; i<5; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}
		System.out.println();
		
		// �ι� ° ��� ���
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		int num2 = scanner.nextInt();
		System.out.println("---[2��]---");
		if(num2>0) {
			for(int i=num2; i>0; i--) {
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}else { // ����ó��(�Է¹��� ���� 0���� �� ��, �⺻�� 5�� ����)
			for(int i=5; i>0; i--) {
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}
		System.out.println(); 
		
		// ���� ° ��� ���
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		int num3 = scanner.nextInt();
		int half = (num3-1)/2;
		System.out.println("---[3��]---");
		if(num3>0 && num3%2!=0) {
			// ���̾Ƹ�� �� �κ�
			for(int i=0; i<half; i++) { // �� 
				for(int j=half-i; j>0; j--) // ��ĭ
					System.out.print(" ");
				for(int k=0; k<2*i+1; k++) // ��
					System.out.print("*");
				System.out.println();	
			}
			// ���̾Ƹ�� �Ʒ� �κ�
			for(int i=0; i<half+1; i++) { // ��
				for(int j=0; j<i; j++) // ��ĭ
					System.out.print(" ");
				for(int k=num3; k>2*i; k--) // ��
					System.out.print("*");
				System.out.println();	
			}
		}else { // ����ó��(�Է¹��� ���� 0�����̰ų� ¦�� �� ��, �⺻�� 9�� ����)
			for(int i=0; i<4; i++) {
				for(int j=4-i; j>0; j--) 
					System.out.print(" ");
				for(int k=0; k<2*i+1; k++)  
					System.out.print("*");
				System.out.println();	
			}
			for(int i=0; i<5; i++) {
				for(int j=0; j<i; j++) 
					System.out.print(" ");
				for(int k=9; k>2*i; k--) 
					System.out.print("*");
				System.out.println();	
			}
		}
		
		scanner.close();
		
	}

}
