package com.test05;

/*
 * abstract,�߻�Ŭ����
 * 
 */
abstract class Database{
	public void open() {//����O
		System.out.println("Database open");
	}
	abstract void select(); //����x
}

class Oracle extends Database{  //abstract->extends��!
	public void select() {
		System.out.println("Oracle open");
	}
}
class MySql extends Database{
	public void select() {//�������̵�
		System.out.println("MySql open");
	}
}

class DbManager{
	Database db;
	public DbManager(Database db){
		this.db = db;
	}
	public void run(){
		db.select();
		db.open();
	}
}

public class Sample06 {

	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.open();
		oracle.select();
		
//		Database db = new Oracle();
//		db.open();
//		db.select();
//		
//		Database db2 = new MySql();
//		db2.open();
//		db2.select();

		DbManager dbm = new DbManager(oracle);
		dbm.run();
	}

}
