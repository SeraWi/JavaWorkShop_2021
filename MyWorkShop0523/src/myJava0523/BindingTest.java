package myJava0523;
class Parent{
	int x= 100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int x = 200;
	@Override
	void method() {
		System.out.println("Child Method");
	}
}
public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x=" +p.x);//p.x=100
		p.method();//Child Metho, 참조변수 타입에 상관없이 항상 실제 인스턴스의 타입인 child클래스에 정의된 메서드가 호출
		
		System.out.println("c.x=" +c.x);//c.x=200
		c.method();//Child Method
	}

}
