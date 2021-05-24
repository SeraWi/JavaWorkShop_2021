package myJava0512;
/*
 * 접근 제어자: protected
 * 
 * 
 */

class A{ // default,패키지 안에 사용
	//private int a; 
	protected int a; //상속 받은 애들만 사용 가능
	
}
class B extends A{
	
}

public class Sample05 {

	public static void main(String[] args) {
		B b = new B();
		// b.a  불가능,private은 상속관계여도 접근 불가능
		b.a = 10; // 접근 가능, protected는 상속 받은 애들로 제한
		
	}

}
