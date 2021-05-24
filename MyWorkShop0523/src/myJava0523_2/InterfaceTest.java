package myJava0523_2;

class A{
	public void methodA(B b) {
		b.methodB();
	}
}
class B{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		B b= new B();
		b.methodB();
		
		A a =  new A();
		a.methodA(b);//methodB()
	}

}
