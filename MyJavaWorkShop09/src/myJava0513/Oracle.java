package myJava0513;

public class Oracle extends Database {
	public Oracle(String connString) {//protected connString 그냥 쓸때
		this.connString = connString;
	}
	
	public void setConnString(String connString) { // connString 재정의
		this.connString = connString;
	}
	public String getConnString() {
		return this.connString;
	}
	public void open() {
		System.out.println("Oracle open:"+this.connString);
	}
}
