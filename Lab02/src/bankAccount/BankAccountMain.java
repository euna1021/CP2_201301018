package bankAccount;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		// 입금되는 금액이 200억이상일 때를 대비하여, int보다 범위가 큰 자료형 long을 사용함
		long money; 
		int month;

		System.out.println("은행명: "+account.getBankName()+"\n"+"계좌 주인명: "+account.getName()+"\n"+
		                   "계좌 번호: "+account.getAccountNumber()+"\n"+"잔액:"+account.getBalance()+"원 \n");
		
		// 입금 시나리오 1
		money = 100000;
		account.deposit(money);
		System.out.println("[입금] \n 입금액: "+money);
		System.out.println(" 잔액: "+account.getBalance()+"\n\n");
		
		// 출금 시나리오 1
		money = 100000;
		account.widraw(money);
		if(account.getBalance()>=money) 
			System.out.println("[출금]");
		else 
			System.out.println("[출금 실패]");
		System.out.println(" 출금액: "+money);
		System.out.println(" 잔액: "+account.getBalance()+"\n\n");
		
		// 적금 시나리오
		money = 10000;
		month = 12;
		System.out.println("[적금] \n 적금액: "+money+", 개월 수: "+month);
		System.out.println(" 잔액: "+account.installmentSavingPredict(month, money)+"\n\n");
		
		// 정기 예금 시나리오
		money = 2000000;
		month = 24;
		System.out.println("[정기예금] \n 예금액: "+money+", 개월 수: "+month);
		System.out.println(" 잔액: "+account.fixedDepositPredict(month, money)+"\n\n");
		
		
		// 입금 시나리오 2 (200억이상 입금)
		// money가 int타입이 아니라, long타입이라는 것을 알려주기위해 수 뒤에 'L'를 붙여줌
		money = 2000000000L;
		account.deposit(money);
		System.out.println("[입금] \n 입금액: "+money);
		System.out.println(" 잔액: "+account.getBalance()+"\n\n");
		
		// 출금 시나리오 2 (잔액 이상 출금)
		money = 30000000000000L;
		account.widraw(money);
		if(account.getBalance()>=money) 
			System.out.println("[출금]");
		else 
			System.out.println("[출금 실패]");
		System.out.println(" 출금액: "+money);
		System.out.println(" 잔액: "+account.getBalance()+"\n\n");
		
		
 	}

}
