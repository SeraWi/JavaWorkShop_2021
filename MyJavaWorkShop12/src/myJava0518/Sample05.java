package myJava0518;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample05 {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(3);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());//123,중복되는거 사라진다.
		}

	}

}
