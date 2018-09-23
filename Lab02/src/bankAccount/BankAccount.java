package bankAccount;

public class BankAccount {

	// 필드 
	private String bankName; // 은행명
	private String name; // 이름
	private String accountNumber; // 계좌번호
	private long balance; // 잔액(int보다 큰 범위)
	private double interestRate; // 이율(실수형)
	
	// 생성자
	public BankAccount(String bankName, String name, String accountNumber, long balance, double interestRate) {
		this.bankName = bankName;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate; 
	}

	// 접근자, 설정자
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// 메소드
	// 입금
	public void deposit(long money) { 
		this.balance += money;
	}
	
	// 출금
	public void widraw(long money) { 
		if(this.balance >= money) 
			this.balance -= money;
		else  
			// 잔액보다 출금하려는 금액이 클 때는 잔액이 그대로 남도록 함 (잔액 = 잔액) no effect
			this.balance = this.balance;	
	}
	
	// 적금
	public long installmentSavingPredict(int month, long money) { 
		// 형변환 - 이율은 실수형이고, 더해지는 나머지 필드는 정수형이라 타입이 불일치 하므로, int로 캐스팅해줌
		this.balance = getBalance()+(money*month)+(int)(money*getInterestRate()/12*month*(month+1)/2);
		return balance;
	}
	
	// 정기 예금
	public long fixedDepositPredict(int month, long money) { 
		// 형변환, 제곱함수 - math.pow(밑, 지수) 형태
		this.balance = getBalance()+money+(int)(money*(Math.pow(1+getInterestRate()/12, month)-1));
		return balance;
	}

}
