package lab01;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 첫 번째 모양 출력
		System.out.print("몇 개의 줄로 별을 출력할까요? ");
		int num1 = scanner.nextInt();
		System.out.println("---[1번]---");	
		if(num1>0) {
			for(int i=0; i<num1; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}else { // 예외처리(입력받은 수가 0이하 일 때, 기본값 5로 설정)
			for(int i=0; i<5; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}
		System.out.println();
		
		// 두번 째 모양 출력
		System.out.print("몇 개의 줄로 별을 출력할까요? ");
		int num2 = scanner.nextInt();
		System.out.println("---[2번]---");
		if(num2>0) {
			for(int i=num2; i>0; i--) {
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}else { // 예외처리(입력받은 수가 0이하 일 때, 기본값 5로 설정)
			for(int i=5; i>0; i--) {
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		}
		System.out.println(); 
		
		// 세번 째 모양 출력
		System.out.print("몇 개의 줄로 별을 출력할까요? ");
		int num3 = scanner.nextInt();
		int half = (num3-1)/2;
		System.out.println("---[3번]---");
		if(num3>0 && num3%2!=0) {
			// 다이아몬드 윗 부분
			for(int i=0; i<half; i++) { // 줄 
				for(int j=half-i; j>0; j--) // 빈칸
					System.out.print(" ");
				for(int k=0; k<2*i+1; k++) // 별
					System.out.print("*");
				System.out.println();	
			}
			// 다이아몬드 아랫 부분
			for(int i=0; i<half+1; i++) { // 줄
				for(int j=0; j<i; j++) // 빈칸
					System.out.print(" ");
				for(int k=num3; k>2*i; k--) // 별
					System.out.print("*");
				System.out.println();	
			}
		}else { // 예외처리(입력받은 수가 0이하이거나 짝수 일 때, 기본값 9로 설정)
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
