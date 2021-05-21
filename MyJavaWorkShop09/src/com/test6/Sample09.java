package com.test6;

public class Sample09 {

	public static void main(String[] args) {
		try {
			int a  = 1/0;
		}catch(Exception ex) {//Exception이 가장 상위 타입이다! 
			System.out.println("오류가 발생하였으니 관리자에게 문의해주세요.");
		}
		
		try {
			int a  = 1/0;
		}catch(OutOfMemoryError ex) {//예외에 맞는 정확한 명칭 쓰기, 위에서는 세부적으로 
			System.out.println("OutOfMemoryError 오류가 발생하였으니 관리자에게 문의해주세요.");
		}catch(ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException 오류가 발생하였습니다.");
		}catch(Exception ex) { //가장 마지막에 상위타입 예외처리
			System.out.println("Exception 오류가 발생하였습니다.");
		}
		System.out.println("종료합니다.");
		
	}

}
