package myJava0512;
/*
 * ���� ������: protected
 * 
 * 
 */

class A{ // default,��Ű�� �ȿ� ���
	//private int a; 
	protected int a; //��� ���� �ֵ鸸 ��� ����
	
}
class B extends A{
	
}

public class Sample05 {

	public static void main(String[] args) {
		B b = new B();
		// b.a  �Ұ���,private�� ��Ӱ��迩�� ���� �Ұ���
		b.a = 10; // ���� ����, protected�� ��� ���� �ֵ�� ����
		
	}

}
