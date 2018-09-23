package bankAccount;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		// �ԱݵǴ� �ݾ��� 200���̻��� ���� ����Ͽ�, int���� ������ ū �ڷ��� long�� �����
		long money; 
		int month;

		System.out.println("�����: "+account.getBankName()+"\n"+"���� ���θ�: "+account.getName()+"\n"+
		                   "���� ��ȣ: "+account.getAccountNumber()+"\n"+"�ܾ�:"+account.getBalance()+"�� \n");
		
		// �Ա� �ó����� 1
		money = 100000;
		account.deposit(money);
		System.out.println("[�Ա�] \n �Աݾ�: "+money);
		System.out.println(" �ܾ�: "+account.getBalance()+"\n\n");
		
		// ��� �ó����� 1
		money = 100000;
		account.widraw(money);
		if(account.getBalance()>=money) 
			System.out.println("[���]");
		else 
			System.out.println("[��� ����]");
		System.out.println(" ��ݾ�: "+money);
		System.out.println(" �ܾ�: "+account.getBalance()+"\n\n");
		
		// ���� �ó�����
		money = 10000;
		month = 12;
		System.out.println("[����] \n ���ݾ�: "+money+", ���� ��: "+month);
		System.out.println(" �ܾ�: "+account.installmentSavingPredict(month, money)+"\n\n");
		
		// ���� ���� �ó�����
		money = 2000000;
		month = 24;
		System.out.println("[���⿹��] \n ���ݾ�: "+money+", ���� ��: "+month);
		System.out.println(" �ܾ�: "+account.fixedDepositPredict(month, money)+"\n\n");
		
		
		// �Ա� �ó����� 2 (200���̻� �Ա�)
		// money�� intŸ���� �ƴ϶�, longŸ���̶�� ���� �˷��ֱ����� �� �ڿ� 'L'�� �ٿ���
		money = 2000000000L;
		account.deposit(money);
		System.out.println("[�Ա�] \n �Աݾ�: "+money);
		System.out.println(" �ܾ�: "+account.getBalance()+"\n\n");
		
		// ��� �ó����� 2 (�ܾ� �̻� ���)
		money = 30000000000000L;
		account.widraw(money);
		if(account.getBalance()>=money) 
			System.out.println("[���]");
		else 
			System.out.println("[��� ����]");
		System.out.println(" ��ݾ�: "+money);
		System.out.println(" �ܾ�: "+account.getBalance()+"\n\n");
		
		
 	}

}
