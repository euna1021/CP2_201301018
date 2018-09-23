package bankAccount.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bankAccount.BankAccount;

class BankAccountTest {
	
	@Test
	void testBankAccount() {
		// 4개의 BankAccount의 객체 생성
		// 초기값을 null값으로 설정
		BankAccount bankAccount_0 = null;
		BankAccount bankAccount0 = new BankAccount(null, null, null, 0, 0); 
		BankAccount bankAccount1 = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		// 초기값을 bankAccount와 같은 값으로 설정
		BankAccount bankAccount2 = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		// 초기값을 bankAccount와 다른 값으로 설정
		BankAccount bankAccount3 = new BankAccount("국민은행","천은아","352-0304-3851-03", 300000, 0.1);
		
		// 같은 객체인지, 다른 객체인지 확인 - 메모리주소값으로 판별
		assertSame(bankAccount1, bankAccount1);
		assertNotSame(bankAccount1, bankAccount2);
		assertNotSame(bankAccount2, bankAccount3);
		// 객체가 null인지, null이 아닌지 판별 - 초기값이 null인지 판별하는 것 아님
		assertNotNull(bankAccount1);
		assertNotNull(bankAccount0);
		assertNull(bankAccount_0);
		
	}
	
	@Test
	void testGetBankName() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		assertEquals("농협",bankAccount.getBankName()); // 동일한 값이어야 성공
		assertTrue(bankAccount.getBankName() == "농협"); // 참이어야 성공
		assertFalse(bankAccount.getBankName() == "국민은행"); // 거짓이어야 성공
	}
	
	@Test
	void testGetAccountNumber() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		assertNotEquals("555-0000-0000-55",bankAccount.getAccountNumber()); // 상이한 값이어야 성공
		assertTrue(bankAccount.getAccountNumber() == "352-0304-3851-03");
		assertFalse(bankAccount.getAccountNumber() == "555-5555-5555-55");
	}

	@Test
	void testGetInterestRate() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		assertEquals(0.1,bankAccount.getInterestRate());
		assertTrue(bankAccount.getInterestRate() == 0.1);
		assertFalse(bankAccount.getInterestRate() == 0.3);
	}
	
	@Test
	void testGetName() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		assertNotEquals("바나나",bankAccount.getName());
		assertTrue(bankAccount.getName() == "천은아");
		assertFalse(bankAccount.getName() == "토마토");
	}
	
	@Test
	void testGetBalance() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		assertEquals(300000,bankAccount.getBalance());
		assertTrue(bankAccount.getBalance() == 300000);
		assertFalse(bankAccount.getBalance() == 300001);
	}
	
	@Test
	void testDeposit() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		bankAccount.deposit(100000);
		assertEquals(400000,bankAccount.getBalance());
		assertTrue(bankAccount.getBalance() == 400000);
		assertFalse(bankAccount.getBalance() == 400001);
	}

	@Test
	// BankAccountMain에서와 결과값 동일하게 나타내기위해 잔액의 초기설정을 바꿈
	void testWidraw() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 400000, 0.1);
		bankAccount.widraw(100000);
		assertEquals(300000,bankAccount.getBalance());
		assertTrue(bankAccount.getBalance() == 300000);
		assertFalse(bankAccount.getBalance() == 200000);
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 300000, 0.1);
		assertEquals(426500,bankAccount.installmentSavingPredict(12, 10000));
		assertTrue(bankAccount.installmentSavingPredict(12, 10000) == 553000);
		assertFalse(bankAccount.installmentSavingPredict(12, 10000) == 300000);
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount bankAccount = new BankAccount("농협","천은아","352-0304-3851-03", 426500, 0.1);
		assertEquals(2867281,bankAccount.fixedDepositPredict(24, 2000000));
		assertTrue(bankAccount.fixedDepositPredict(24, 2000000) == 5308062);
		assertFalse(bankAccount.fixedDepositPredict(24, 2000000) == 2000000);
	}

}
