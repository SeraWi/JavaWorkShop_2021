package Exception;
/*
 * 사용자 정의 예외
 */
class MyException extends Exception{  //내가 만든 예외처리
	MyException(String msg){ // 생성자
		super(msg);
	}
	
}
public class Sample03 {
//	static void checkMethod(int num) { 
//		if(num % 2 == 0) {
//			throw new ArithmeticException(); //예외를 발생시키기
//		}
//	}
	
	static void checkMethod(int num) throws MyException { //예외 처리 떠넘기기
		if(num % 2 == 0) {
			throw new MyException("짝수입니다."); //예외를 발생시키기
		}
	}
	
	public static void main(String[] args) {
//		 checkMethod(1);// 에러! 호출되었을 때 예외 처리 해줘야
//		 checkMethod(2); //
		
		try {
			throw new MyException("나의 오류입니다.");//예외 발생시키고->try catch 해주기
		} catch (MyException ex) { 
			System.out.println("오류입니다."+ ex.getMessage());
		}//예외 발생시키기
		
		
//		 Exception ex = new Exception("테스트입니다.");//생성자
//		 try {
//			throw ex;
//		} catch (Exception e) {
//			System.out.println(ex.getMessage());
//		}
	}
}
