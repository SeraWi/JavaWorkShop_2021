package myJava0518;
/*
 * 내부 클래스
 * 
 */
public class Sample07 {
	
	static class StaticClass{
		 void testMethod2() {
			System.out.println("testMethod2 in StaticClass"+b);
		}
	}
	static int b = 30;
	public static void main(String[] args) {
		Sample07 obj = new Sample07();
		Sample07.InnerClass obj2 = obj.new InnerClass();
		obj2.testMethod();
//		Sample07.InnerClass obj3 = obj.new InnerClass();
		Sample07.StaticClass obj3 = new Sample07.StaticClass(); 
		
	}
	
	private int a = 10;
	class InnerClass{
		void testMethod() {
			System.out.println("testMethod in innerClass");
		}
	}
}
