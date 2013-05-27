package accounts;

public class Savings extends Account{

	public void close(){
		System.out.println("\n++++++++Savings account closed++++++++");
	}
	
	public void open(){
		System.out.println("\n++++++++Savings account opened++++++++");
		setBalance(500);
	}
	
	public Savings(){
	
	}
}