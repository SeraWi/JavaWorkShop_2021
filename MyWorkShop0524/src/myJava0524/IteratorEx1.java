package myJava0524;

import java.util.*;

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList list =  new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//Iterator it = list.iterator();
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
