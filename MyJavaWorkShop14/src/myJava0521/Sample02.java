package myJava0521;
/*
 * ���ٽ�!
 */
interface ICalculator{
	public int add(int x, int y) ;
}


public class Sample02 {
	public static void main(String[] args) {// �������̽� ��ü�� ���� �߻�Ŭ���� �����̶� �ѹ��� ����
		ICalculator calc = new ICalculator() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		int c = calc.add(30, 50);
		System.out.println(c);
		 
		// ���ٽ�
		ICalculator calc2 = (x , y)->{
			return x + y;
		};
		int c2 = calc2.add(20, 30);
		System.out.println(c2);
		
	}
}
