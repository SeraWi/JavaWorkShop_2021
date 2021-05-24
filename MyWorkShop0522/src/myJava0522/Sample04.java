package myJava0522;

class MyMath{
	long add( long a, long b) {
		return a+ b;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	long devide (long a, long b) {
		return a /b ;
	}
}
public class Sample04 {
	public static void main(String[] args) {
		MyMath math = new MyMath();
		long result = math.add(5L,3L);
		System.out.println(result);//8
		System.out.println(math.subtract(7, 5));
		System.out.println(math.multiply(7, 5));
		System.out.println(math.devide(30, 5));
	}
}
