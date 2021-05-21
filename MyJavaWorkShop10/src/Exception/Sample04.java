package Exception;
/*
 * 예외처리***
 */
class MyException2 extends Exception{
	MyException2(String msg){
		super(msg);
	}
}

public class Sample04 {

	public static void main(String[] args) {
		
		int i = 2;
		
		try {
			if(i == 2) {
			throw new MyException2("안녕하세요.");//인위적으로 예외 발생시키기, i가 2이이면 내가 만든 예외를 발생시킨다.
			}
		} catch (MyException2 e) {
			System.out.println(e.getMessage());//메세지 출력,"안녕하세요."
		} 
		

	}

}
