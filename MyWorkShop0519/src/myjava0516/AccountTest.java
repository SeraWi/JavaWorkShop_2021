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
		Account customer1 = new Account("111-222-3333333","������",20000);
		Account customer2 = new Account("555-666-7777777","���ſ�",100000);
		System.out.println("�⺻������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���");
		Account.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
	}

	static void printAccount(Account customer) {
		System.out.println("���¹�ȣ:"+customer.getAccountNo());
		System.out.println("�������̸�:"+customer.getAccountName());
		System.out.println("�ܾ�:"+customer.getBalance());
		System.out.println();
	}
}
