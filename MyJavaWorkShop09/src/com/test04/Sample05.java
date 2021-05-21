package com.test04;
/*
 * �������̽� ����
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

class DbManager{//***�����ϴ� Ŭ���� �ʿ�!
	IDatabase db; //�������̽� Ÿ��
	public DbManager(IDatabase db ){// IDatabase db = new Oracle();����
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
//		���� �����������ϴ� class�����
		
		DbManager dbg = new DbManager(new Oracle());
		dbg.run();//Oracle open
		DbManager dbg2 = new DbManager(new MySql());
		dbg2.run(); //MySql open
		DbManager dbg3 = new DbManager(new Sqlserver());
		dbg3.run();//Sqlserver open
	}
}




