package myJava0523_3;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);// 실행되지 않는다. 
		}catch(ArithmeticException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("Arithemtic Exception");
		}catch(Exception e) { // Arithmetic 예외 제외하고 모든 예외처리된다.
			System.out.println("Exception");
		}
		System.out.println(6);

	}

}
