package myJava0520;

import java.util.ArrayList;
/*
 * 와일드 카드
 */
public class Sample08 {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}
	//static void test(? a) { 
	// 이렇게 쓸수는 없다.
	//}
	public static void main(String[] args) {
		ArrayList<?> al = new ArrayList<Integer>();
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
	}
}
