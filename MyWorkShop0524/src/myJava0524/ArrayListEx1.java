package myJava0524;

import java.util.*;

public class ArrayListEx1 {

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list 1:"+list1);
		System.out.println("list 2:"+list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1); // 작은 수에서 큰수로 정렬
		Collections.sort(list2);
		print(list1, list2);
		
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));// true
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		print(list1,list2);
		
		list2.set(3, "AA"); // 인덱스3에 AA로 바꾸기
		print(list1,list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다. 
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));//list1에 변화 생기면 true반환
		print(list1,list2); // list2와의 공통요소 이외에는 모두 삭제되었다. (변화가 있었다.)
		

	}

}
