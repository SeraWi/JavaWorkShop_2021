package myJava0517;

class MyCustomException extends Exception{
	MyCustomException(String msg){
		super(msg);// 오버로딩된 메소드 
	}
}

public class Sample02 {

	public static void main(String[] args) {
		int a = 10;
		try {
			if(a == 10) {
				throw new MyCustomException("[에러] a == 10");
			}
		}catch(MyCustomException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
