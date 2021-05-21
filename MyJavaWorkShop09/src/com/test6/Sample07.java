package com.test6;

interface IDatabase{
	public void open();
}

abstract class Database implements IDatabase{
	public void open() {//interface ����
		System.out.println("Database open");
	}
	abstract void select();
}
class Oracle extends Database{
	public void select() { // abstract ����
		System.out.println("Oracle open");
	}
}
public class Sample07 {
	public static void main(String[] args) {
		IDatabase db = new Oracle();
		db.open();
		// db.select();
		Database db2 = new Oracle();
		db2.open();
		db2.select();
		
		
		
	}
}
