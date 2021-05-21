package com.test04;
/*
 * 인터페이스 장점
 */

interface IDatabase{
	public void open();
}

class Oracle implements IDatabase{
	public void open() {
		System.out.println("Oracle open");
	}
}

class MySql implements IDatabase{
	public void open() {
		System.out.println("MySql open");
	}
}
class Sqlserver implements IDatabase{
	public void open() {
		System.out.println("Sqlserver open");
	}
}

class DbManager{//***관리하는 클래스 필요!
	IDatabase db; //인터페이스 타입
	public DbManager(IDatabase db ){// IDatabase db = new Oracle();가능
		this.db  = db; 
	}
	public void run() {
		db.open();
	}
}




public class Sample05 {
	public static void main(String[] args) {
//		IDatabase db = new Oracle();
//		db.open();
//		위에 두줄을관리하는 class만들기
		
		DbManager dbg = new DbManager(new Oracle());
		dbg.run();//Oracle open
		DbManager dbg2 = new DbManager(new MySql());
		dbg2.run(); //MySql open
		DbManager dbg3 = new DbManager(new Sqlserver());
		dbg3.run();//Sqlserver open
	}
}




