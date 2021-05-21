package myJava0520_2;

import java.util.*;

class Testclass{
	public static void addNums(List<? super Integer> list) {
		for(Object o: list) {
			System.out.println(o);
		}
	}
}
public class Sample02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);
		System.out.println(list.getClass().getName());//현재 객체 정보 java.util.Arrays$ArrayList
		Testclass.addNums(list);
	}
}
