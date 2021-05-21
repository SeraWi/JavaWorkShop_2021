package myJava0520;
/*
 *generic method 
 */
public class Sample05 {
	
	static <T> void printMsg(T[] names) {//T[]어레이
		for(T s: names) {
			System.out.println(s);
		}
	}
	static <E> void printMsg2(E[] names) {
		for( E s: names) {
			System.out.println(s);
		}
	}
	
	static <E> void add(E a,E b) {//들어온 숫자 두개를 바꾸기
		E temp = a;
		E x = b;
		E y = temp;
		System.out.println(x+","+y);
	}
	
	public static void main(String[] args) {
		
		String[] names = {"홍길동","이순신","세종대왕"};
		printMsg(names);
		Integer [] arr = {10,20,30,40};
		printMsg(arr);
		
		add(10,20);
		
		Integer a1 = 10;
		Integer b1 = 20;
		add(a1,b1);
		
		
	}
}
