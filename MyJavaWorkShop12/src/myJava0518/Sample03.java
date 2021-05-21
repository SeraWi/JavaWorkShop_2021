package myJava0518;
/*
 * ArrayList
 */
import java.util.*;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1); 
		al.add("이순신");
		al.add(12.3);
		
		
		for(int inx =0 ; inx < al.size(); inx++) { // 하나씩 뽑아내기
			System.out.println(al.get(inx).getClass().getName());
			//java.lang.Integer value 타입아니고 reference 타입임
			//java.lang.String
			//java.lang.Double
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
