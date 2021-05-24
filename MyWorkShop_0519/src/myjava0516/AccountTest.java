package myjava0516;

class Account{
	String accountNO;
	String accountName;
	double balance;
	static double interest;
	public Account(String accountNo,String accountName,double balance){
		this.accountNO = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	public void deposit (int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void addInterest() {
		balance = balance +balance*interest;
	}
	
	public String getAccountNo() {
		return  this.accountNO;
	}
	public String getAccountName() {
		return this.accountName;
	}
	public double getBalance() {
		return this.balance;
	}
}

public class AccountTest {

	public static void main(String[] args) {
		Account customer1 = new Account("111-222-3333333","최은희",20000);
		Account customer2 = new Account("555-666-7777777","남매월",100000);
		System.out.println("기본적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산");
		Account.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
	}

	static void printAccount(Account customer) {
		System.out.println("계좌번호:"+customer.getAccountNo());
		System.out.println("예금주이름:"+customer.getAccountName());
		System.out.println("잔액:"+customer.getBalance());
		System.out.println();
	}
}
