package myJava0512;

public class Sample04 {

	public static void main(String[] args) {
//		Oracle oracle = new Oracle();
//		oracle.open();
//		oracle.select_oracle();
//		
//		MySql mysql = new MySql();
//		mysql.open();
//		mysql.select_mysql();
		
		// 이렇게 줄일 수 있다. 
		
		openDb(new Oracle()); //Oracle open
		openDb(new MySql()); // MySql open
		
	}
	
	static void openDb(Database db) {
		db.open();
	}
}
