package myJava0517;

class MyCustomException extends Exception{
	MyCustomException(String msg){
		super(msg);// �����ε��� �޼ҵ� 
	}
}

public class Sample02 {

	public static void main(String[] args) {
		int a = 10;
		try {
			if(a == 10) {
				throw new MyCustomException("[����] a == 10");
			}
		}catch(MyCustomException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
