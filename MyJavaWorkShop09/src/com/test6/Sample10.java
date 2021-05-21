package com.test6;

class Student{}


public class Sample10 {

	public static void main(String[] args) {
		Student[] a = new Student[3];
		a[0] = new Student();
		try {
			for( int i =0; i <a.length;i++) {
				System.out.println(a[i].toString());
			}
		}catch(NullPointerException ex){
			System.out.println(ex.getMessage()+"오류가 발생하였습니다");
		}catch(Exception ex) {
			System.out.println("알 수 없는 오류");
		}finally { //예외있는 말든 무조건 수행된다. 
			System.out.println("종료");
		}
	}

}
