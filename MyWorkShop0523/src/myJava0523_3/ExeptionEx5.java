package myJava0523_3;

public class ExeptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);// 실행되지 않는다.
		}catch(ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
