package bankAccount;

public class BankAccount {

	// �ʵ� 
	private String bankName; // �����
	private String name; // �̸�
	private String accountNumber; // ���¹�ȣ
	private long balance; // �ܾ�(int���� ū ����)
	private double interestRate; // ����(�Ǽ���)
	
	// ������
	public BankAccount(String bankName, String name, String accountNumber, long balance, double interestRate) {
		this.bankName = bankName;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate; 
	}

	// ������, ������
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
	
	// �޼ҵ�
	// �Ա�
	public void deposit(long money) { 
		this.balance += money;
	}
	
	// ���
	public void widraw(long money) { 
		if(this.balance >= money) 
			this.balance -= money;
		else  
			// �ܾ׺��� ����Ϸ��� �ݾ��� Ŭ ���� �ܾ��� �״�� ������ �� (�ܾ� = �ܾ�) no effect
			this.balance = this.balance;	
	}
	
	// ����
	public long installmentSavingPredict(int month, long money) { 
		// ����ȯ - ������ �Ǽ����̰�, �������� ������ �ʵ�� �������̶� Ÿ���� ����ġ �ϹǷ�, int�� ĳ��������
		this.balance = getBalance()+(money*month)+(int)(money*getInterestRate()/12*month*(month+1)/2);
		return balance;
	}
	
	// ���� ����
	public long fixedDepositPredict(int month, long money) { 
		// ����ȯ, �����Լ� - math.pow(��, ����) ����
		this.balance = getBalance()+money+(int)(money*(Math.pow(1+getInterestRate()/12, month)-1));
		return balance;
	}

}
