package myJava0518;

import java.util.*;
import java.util.Iterator;

class MyList implements Iterable{ // Iterable 인터페이스 구현
	ArrayList al;
	MyList() {
		al = new ArrayList();
	}
	public void addItem(Object o) {
		al.add(o);
	}

	@Override
	public Iterator iterator() { // Iterator:인터페이스 타입
		// TODO Auto-generated method stub
		return new MyListIterator();
	} 
	class MyListIterator implements Iterator{
		int currentIndex = 0;
		@Override
		public boolean hasNext() {
			if(currentIndex >= al.size()) {
				return true;
			}else {
				return false;
			}
		}

		@Override
		public Object next() {
			return al.get(currentIndex++);
		}
	}

}
public class Sample06 {
	public static void main(String[] args) {

		MyList ml = new MyList();
		ml.addItem(1);
		ml.addItem(2);
		Iterator ltr = ml.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		for(Object o : ml) {
			System.out.println(o);
		}
				
	}
}
