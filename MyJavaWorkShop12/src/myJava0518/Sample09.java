package myJava0518;
/*
 * compare
 */
public class Sample09 {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));// a�� �۾Ƽ� -1
		System.out.println(a.compareTo(a));//������ 0
		System.out.println(b.compareTo(a));// b�� ũ�� 1
	}

}
