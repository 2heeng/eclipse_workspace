package exam01;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = new Account();
		
		System.out.println(acc1.getBalance());
		
		acc1.deposit(1000);
		System.out.println(acc1.getBalance());
		
		acc1.deposit(500);
		System.out.println(acc1.getBalance());
		
		try {
		acc1.withdraw(2000);
		System.out.println(acc1.getBalance());
		} catch(InsufficientException e) {
			System.out.println(e.getMessage());;
		}
		
		
		
		
	}

}
