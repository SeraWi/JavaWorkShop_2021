package myJava0522;

class MyMath2{
	long a,b;
	// 인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수 필요없다. 
	long add() {// a,b는 인스턴스 변수
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다. 
	static long add(long a, long b) {// a,b는 지역변수
		return a + b;
	}
	static long subtract(long a, long b) {
		return a - b;
	}
	static long multiply( long a, long b) {
		return a * b;
	}
	static double divide( double a, double b) {
		return a / b;
	}
}

public class MyMathTest2 {

	public static void main(String[] args) {
		//클래스메서드 호출, 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L,100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함
		MyMath2 math = new MyMath2();
		math.a = 200L;
		math.b = 100L;
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());

	}

}
