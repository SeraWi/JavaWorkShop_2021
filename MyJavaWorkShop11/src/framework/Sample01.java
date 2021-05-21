package framework;

import java.util.*;

public class Sample01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//List a12 = new ArrayList(); // 인터페이스타입(상위 타입으로 받기)

		al.add(100);
		al.add(200);
		al.add(300);

		for(int inx = 0; inx <al.size(); inx++) {
			int a = (int)al.get(inx);
			System.out.println(a);
		}

		Iterator itr = al.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
	}


}
