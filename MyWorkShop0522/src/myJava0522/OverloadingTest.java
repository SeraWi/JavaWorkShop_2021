package myJava0522;

class MyMath3{
	int add( int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.println("long add(int a, long b - ");
		return a +b;
	}
	long add(long a, int b) {
		System.out.println("long add(long a, int b) - ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.println("long add(long a, long b) - ");
		return a + b;
	}
	int add(int[] a) {// 배열의 모든 요소의 합을 반환한다. 
		System.out.println("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 math = new MyMath3();
		System.out.println(math.add(3,3));
		System.out.println(math.add(3L,3L));
		System.out.println(math.add(3,3L));
		System.out.println(math.add(3L,3));

		int[] a= {100,200,300};
		System.out.println(math.add(a));
	}
}
