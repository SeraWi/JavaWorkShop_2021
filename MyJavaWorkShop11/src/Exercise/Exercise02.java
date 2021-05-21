package Exercise;
/*
 * StringBufferºñ±³
 */
public class Exercise02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb == sb2); //false
		System.out.println(sb.equals(sb2)); //false
		System.out.println(sb);//abc
		
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println(s.equals(s2));//true
				

		
		
	}
}
