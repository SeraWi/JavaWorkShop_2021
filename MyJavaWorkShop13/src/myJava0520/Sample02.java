package myJava0520;

import java.util.*;//*:와일드 카드
/*
 * collection framework 복습
 * ArrayList
 * getName()
 */

public class Sample02 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("이순신");
		al.add("강감찬");
		al.add(12.5);
		al.add(false);
		al.set(0,"세종대왕");
		
		Object obj = al.get(0); //오브젝트 타입으로 반환한다.클래스 타입!
		System.out.println(obj.getClass().getName()); // 객체에 대한 타입정보 알수 있다. java.lang.Integer
		Object obj2 = al.get(1); // String
		System.out.println(obj2.getClass().getName());// java.lang.String
		
		al.size();
		for(int inx = 0; inx <al.size();inx++) {
			Object o =al.get(inx);
			System.out.println(o.toString());
			//System.out.println(al.get(inx));
		}
		HashSet h = new HashSet();
		h.add("홍길동");
		h.add("이순신");
		h.add("홍길동");
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); //중복없이 나온다. 
		}
		
	}
}
