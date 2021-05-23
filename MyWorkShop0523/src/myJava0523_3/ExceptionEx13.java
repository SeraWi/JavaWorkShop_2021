package myJava0523_3;

public class ExceptionEx13 {
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1메소드에서 예외 처리가 되었습니다. ");
		}
	}
	public static void main(String[] args) {
		method1();// 같은 클래스, static함수, 객체 생성없이 직접 호출가능
	}

}
