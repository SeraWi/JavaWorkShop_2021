package myJava0520;

import java.util.ArrayList;
/*
 * ���ϵ� ī��
 */
public class Sample08 {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}
	//static void test(? a) { 
	// �̷��� ������ ����.
	//}
	public static void main(String[] args) {
		ArrayList<?> al = new ArrayList<Integer>();
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
	}
}
