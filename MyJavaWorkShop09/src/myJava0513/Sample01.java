package myJava0513;
/*
 * 5월13일 목요일
 * 객체지향: 캡슐화, 다형성, 상속성
 */

public class Sample01 {

	public static void main(String[] args) {
		Database db = new Oracle("Server; Address");
		db.open(); //Oracle open : Server; ADdress
	}

}
