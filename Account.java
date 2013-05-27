package accounts;


public abstract class Account {

	int balance;
	int accountid;
	
	public int getBalance()
	{
		return balance;
	}	
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getAccountid(){
		return accountid;
	}
	
	public void setAccountid(int accountid){
		this.accountid = accountid;
	}
	
	public Account() {
	
	}
	
	public abstract void open(); // abstract methods
	
	public abstract void close(); // abstract methods
	
	public void deposit(int amount){
		balance = balance + amount;
	}
	
	public void withDrawl(int amount) {
		balance = balance - amount;
	}
	
	public void display(){
		System.out.println("Account ID: "+ accountid);
		System.out.println("balance : "+balance);
	}
}