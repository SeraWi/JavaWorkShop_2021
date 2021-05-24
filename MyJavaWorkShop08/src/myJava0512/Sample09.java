package myJava0512;
/*
 * abstract : 의미: 불완전하다 ->객체화 시킬 수 없다.
 */
abstract class Student3{
	void studying() {
		System.out.println("Student3 study");
	}
	abstract void eating();
}
class Student4 extends Student3{
	public void eating() {// 오버라이딩
		System.out.println("Student4 eating");
	}
}


public class Sample09 {

	public static void main(String[] args) {
		// Student3 s = new Student3(); class가 abstract라 객체 만들수 없다. 
		Student4 s = new Student4(); // 객체화 가능
		s.eating(); //Student4 eating
		s.studying(); //Student3 study
	}

}
