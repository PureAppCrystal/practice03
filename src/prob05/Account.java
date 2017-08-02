package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	
	// 생성자
	public Account (String accountNo ) {
		this.accountNo = accountNo;
		System.out.println(this.accountNo+" 계좌가 개설되었습니다.");
	}

	
	
	// 게터
	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}


	
	//함수 
	public void save (int value) {
		balance = balance + value;
		System.out.println(accountNo+" 계좌에 "+value+"만원이 입금되었습니다.");
	}
	
	public void deposit ( int value) {
		if ( balance >= value ) {
			balance = balance - value;
			System.out.println(accountNo+" 계좌에 "+value+"만원이 출금되었습니다.");
		} else {
			//출금액이 잔액보다 많을경우 처리 
		}
	}
	
	
}
