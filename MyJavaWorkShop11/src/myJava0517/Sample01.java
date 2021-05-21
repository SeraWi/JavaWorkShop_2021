package myJava0517;
/*
 * 5월 17일 월요일
 * 예외처리 복습
 */
public class Sample01 {
	
	static void method1() throws Exception{//예외 넘기기
		int b = 10/0;
	}
	static void method2() throws Exception{
		method1();
	}
	
	public static void main(String[] args) {
		try {
		method2();// 마지막으로 여기서 예외처리 해줘야
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		try {
//			//int a = 10/0;
//			throw new ArithmeticException();//예외 발생 시키기
//		}catch(ArithmeticException ex){
//			System.out.println(ex.getMessage());
//		}catch(Exception ex){
//			System.out.println("그외의 예외");
//		}finally {
//			System.out.println("End");
//		}

	}		
}
