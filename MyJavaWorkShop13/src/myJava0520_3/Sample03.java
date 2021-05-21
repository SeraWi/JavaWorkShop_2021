package myJava0520_3;
/*
 *annotation 
 */
class A{
	void aMethod() {
		System.out.println("aMethod in A");
	}
	@Deprecated
	void bMethod() {
		System.out.println("bMethod in B");
	}
}
public class Sample03 {
	public static void main(String[] args) {
		A a = new A();
		a.aMethod();
		a.bMethod();
	}
}
