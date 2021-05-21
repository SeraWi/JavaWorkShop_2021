package com.test03;
/*
 * interface:표준
 */
interface IDatabase{ 
	public void open();// 구현체가 없다
}
interface IQery{
	public void select();
}

class Oracle implements IDatabase, IQery{ //상속과 구현, 다중상속 가능
	public void open() {// 오버라이딩, 반드시 써줘야 한다.안쓰면 에러-> 규격화 시켜주고 있다.
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

	static void openDb(IDatabase db) { //interface 타입***
		db.open();
	}
	
	public static void main(String[] args) {
		//IDatabase db = new IDatabase(); //객체 생성 불가
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


