package Exception;



/*
 * 5월 14일 금요일
 * 예외처리
 */

//public class Sample02 {
//	void method1() throws Exception{ //예외를 넘기기
//		try {
//			int a = 10/0;
//		//throw new Exception(); //예외를 발생시키기
//		}catch(Exception ex) {
//
//		}
//	}
//	void method2() {
//		method1();
//	}
//	void method3()  {
//		method2();
//	}
//	public static void main(String[] args) {
//
//		Sample02 obj = new Sample02();
//		obj.method3();
//		System.out.println("EXIT");
//	}
//
//}





public class Sample02 {
	void method1() throws Exception{ //throws = 예외 넘기기, 여기서 할 수 도 있다!
		int a = 10/0;
	}
	void method2() throws Exception { //예외 넘기기
		method1();
	}
	void method3() throws Exception {//예외넘기기
		method2();
	}
	public static void main(String[] args) {
		
		
		Sample02 obj = new Sample02();
		try {//마지막으로 메인에서 예외 처리하게 됨
		obj.method3();
		}catch(Exception ex) {
			System.out.println("EXIT");
		}
		
		
	}

}
