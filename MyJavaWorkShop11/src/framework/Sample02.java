package framework;

import java.util.ArrayList;
import java.util.Iterator;

class Food{
	
}
class ChinaFood extends Food{
	
}
class KoreanFood extends Food{
	
}

public class Sample02 {
	public static void main(String[] args) {
		Food[] foods = new Food[3];
		foods[0] = new Food();
		foods[1] = new Food();
		foods[2] = new Food();
		
		ArrayList al = new ArrayList();// 크기 제한 없다
		al.add(new Food());
		al.add(new ChinaFood());
		al.add(new KoreanFood());
		al.add(new Food());
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
	}
}
