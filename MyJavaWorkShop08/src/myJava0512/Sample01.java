package myJava0512;
/*
 * 5월 12일
 * 변수 초기화
 */
class MyClass{
	int a; // 객체 만들때 마다 새로 생성
	static int b; //0으로 초기화된 상태/, 계속 유지된다. 
	static { // 한번만 호출된다. 
		b = 10;
		System.out.println(b);
		System.out.println("Static Inital");
	}
	MyClass(){
		a = 200;
		System.out.println(a);
		System.out.println("Default Constructor");
		System.out.println(b++);
	}
}


public class Sample01 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();  //10, Static Inital, 200 ,Default COnstructor - static 변수처음 한번만 호출된다. 
		System.out.println(MyClass.b); // 10
		
		MyClass obj2 =new MyClass(); // 200, Default Constructor,11(b가 증가한다.)
		
	}
	

}
