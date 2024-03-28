package ch06;

public class AccountAnswer {
	
	//상수로 값을 고정하면
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	//필
	private int balance;
	
	
	//메
	public int getBalance(){
		return this.balance;
	}
	
	public void setBalance(int balance) {
		//매개변수는 음수값이 될 수 없고
		if(balance < AccountAnswer.MIN_BALANCE) {
			return;
		} else if(balance > AccountAnswer.MAX_BALANCE) {
			return;
		} else {this.balance=balance;}
		
	}
}
