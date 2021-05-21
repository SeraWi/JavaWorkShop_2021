package com.test03;
/*
 * interface:ǥ��
 */
interface IDatabase{ 
	public void open();// ����ü�� ����
}
interface IQery{
	public void select();
}

class Oracle implements IDatabase, IQery{ //��Ӱ� ����, ���߻�� ����
	public void open() {// �������̵�, �ݵ�� ����� �Ѵ�.�Ⱦ��� ����-> �԰�ȭ �����ְ� �ִ�.
		System.out.println("Oracle open");
	}
	public void select() { 
		System.out.println("Oracle query");
	}
}

class MySql implements IDatabase{
	public void open() {
		System.out.println("MySql open");
	}
}


public class Sample03 {

	static void openDb(IDatabase db) { //interface Ÿ��***
		db.open();
	}
	
	public static void main(String[] args) {
		//IDatabase db = new IDatabase(); //��ü ���� �Ұ�
		Oracle oracle = new Oracle();
		oracle.open();
		oracle.select();//Oracle query
		IDatabase db = new Oracle(); 
		db.open();//Oracel open***
		IDatabase db2 = new MySql();
		db2.open(); //MySql open***
		
		openDb(oracle); //oracle open
		openDb(db); //oracle open
		openDb(db2); //masql open

	}

}


