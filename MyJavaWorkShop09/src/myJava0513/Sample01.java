package myJava0513;
/*
 * 5��13�� �����
 * ��ü����: ĸ��ȭ, ������, ��Ӽ�
 */

public class Sample01 {

	public static void main(String[] args) {
		Database db = new Oracle("Server; Address");
		db.open(); //Oracle open : Server; ADdress
	}

}
