package myJava0518;
/*
 * compare
 */
public class Sample09 {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));// a가 작아서 -1
		System.out.println(a.compareTo(a));//같으면 0
		System.out.println(b.compareTo(a));// b가 크면 1
	}

}
