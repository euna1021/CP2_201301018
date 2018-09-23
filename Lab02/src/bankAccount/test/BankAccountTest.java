package bankAccount.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bankAccount.BankAccount;

class BankAccountTest {
	
	@Test
	void testBankAccount() {
		// 4���� BankAccount�� ��ü ����
		// �ʱⰪ�� null������ ����
		BankAccount bankAccount_0 = null;
		BankAccount bankAccount0 = new BankAccount(null, null, null, 0, 0); 
		BankAccount bankAccount1 = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		// �ʱⰪ�� bankAccount�� ���� ������ ����
		BankAccount bankAccount2 = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		// �ʱⰪ�� bankAccount�� �ٸ� ������ ����
		BankAccount bankAccount3 = new BankAccount("��������","õ����","352-0304-3851-03", 300000, 0.1);
		
		// ���� ��ü����, �ٸ� ��ü���� Ȯ�� - �޸��ּҰ����� �Ǻ�
		assertSame(bankAccount1, bankAccount1);
		assertNotSame(bankAccount1, bankAccount2);
		assertNotSame(bankAccount2, bankAccount3);
		// ��ü�� null����, null�� �ƴ��� �Ǻ� - �ʱⰪ�� null���� �Ǻ��ϴ� �� �ƴ�
		assertNotNull(bankAccount1);
		assertNotNull(bankAccount0);
		assertNull(bankAccount_0);
		
	}
	
	@Test
	void testGetBankName() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		assertEquals("����",bankAccount.getBankName()); // ������ ���̾�� ����
		assertTrue(bankAccount.getBankName() == "����"); // ���̾�� ����
		assertFalse(bankAccount.getBankName() == "��������"); // �����̾�� ����
	}
	
	@Test
	void testGetAccountNumber() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		assertNotEquals("555-0000-0000-55",bankAccount.getAccountNumber()); // ������ ���̾�� ����
		assertTrue(bankAccount.getAccountNumber() == "352-0304-3851-03");
		assertFalse(bankAccount.getAccountNumber() == "555-5555-5555-55");
	}

	@Test
	void testGetInterestRate() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		assertEquals(0.1,bankAccount.getInterestRate());
		assertTrue(bankAccount.getInterestRate() == 0.1);
		assertFalse(bankAccount.getInterestRate() == 0.3);
	}
	
	@Test
	void testGetName() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		assertNotEquals("�ٳ���",bankAccount.getName());
		assertTrue(bankAccount.getName() == "õ����");
		assertFalse(bankAccount.getName() == "�丶��");
	}
	
	@Test
	void testGetBalance() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		assertEquals(300000,bankAccount.getBalance());
		assertTrue(bankAccount.getBalance() == 300000);
		assertFalse(bankAccount.getBalance() == 300001);
	}
	
	@Test
	void testDeposit() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		bankAccount.deposit(100000);
		assertEquals(400000,bankAccount.getBalance());
		assertTrue(bankAccount.getBalance() == 400000);
		assertFalse(bankAccount.getBalance() == 400001);
	}

	@Test
	// BankAccountMain������ ����� �����ϰ� ��Ÿ�������� �ܾ��� �ʱ⼳���� �ٲ�
	void testWidraw() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 400000, 0.1);
		bankAccount.widraw(100000);
		assertEquals(300000,bankAccount.getBalance());
		assertTrue(bankAccount.getBalance() == 300000);
		assertFalse(bankAccount.getBalance() == 200000);
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 300000, 0.1);
		assertEquals(426500,bankAccount.installmentSavingPredict(12, 10000));
		assertTrue(bankAccount.installmentSavingPredict(12, 10000) == 553000);
		assertFalse(bankAccount.installmentSavingPredict(12, 10000) == 300000);
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount bankAccount = new BankAccount("����","õ����","352-0304-3851-03", 426500, 0.1);
		assertEquals(2867281,bankAccount.fixedDepositPredict(24, 2000000));
		assertTrue(bankAccount.fixedDepositPredict(24, 2000000) == 5308062);
		assertFalse(bankAccount.fixedDepositPredict(24, 2000000) == 2000000);
	}

}
