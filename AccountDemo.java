package accounts;

public class AccountDemo{
	
	public static void main(String[] args){
		Account acc = new Savings();
		acc.open();
		acc.setAccountid(123456);
		acc.deposit(5000);
		acc.display();
		acc.withDrawl(5500);
		acc.display();
		acc.close();
		
		// aqui se llama la extendida
		
		Account accCurrent = new Current();
		accCurrent.open();
		accCurrent.setAccountid(123457);
		accCurrent.deposit(10000);
		accCurrent.display();
		acc.withDrawl(9000);
		accCurrent.display();
		accCurrent.close();
		
	}
}