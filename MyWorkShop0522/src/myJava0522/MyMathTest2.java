package myJava0522;

class MyMath2{
	long a,b;
	// �ν��Ͻ� ���� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű����� �ʿ����. 
	long add() {// a,b�� �ν��Ͻ� ����
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
	// �ν��Ͻ������� ������� �Ű����������� �۾��� �����ϴ�. 
	static long add(long a, long b) {// a,b�� ��������
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
		//Ŭ�����޼��� ȣ��, �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMath2.add(200L,100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		// �ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������
		MyMath2 math = new MyMath2();
		math.a = 200L;
		math.b = 100L;
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());

	}

}
