package myJava0521;
/*
 * 람다식!
 */
interface ICalculator{
	public int add(int x, int y) ;
}


public class Sample02 {
	public static void main(String[] args) {// 인터페이스 객체로 만들어서 추상클래스 구현이랑 한번에 쓰기
		ICalculator calc = new ICalculator() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		int c = calc.add(30, 50);
		System.out.println(c);
		 
		// 람다식
		ICalculator calc2 = (x , y)->{
			return x + y;
		};
		int c2 = calc2.add(20, 30);
		System.out.println(c2);
		
	}
}
