package myJava0520_3;

enum Season{// enum 도 클래스-> 변수, 생성자, 메소드 가질 수 있다.
	winter(10), summer(20);
	private int value;
	Season(int value){
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}

public class Sample02 {
	public static void main(String[] args) {
		for(Season s:Season.values()) {
			System.out.println(s+","+s.getValue());
		}
		for(MyMenu s2 : MyMenu.values()) {
			System.out.println(s2 +","+s2.getA());
		}
	}
}
