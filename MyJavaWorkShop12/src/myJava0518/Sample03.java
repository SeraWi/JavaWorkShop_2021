package myJava0518;
/*
 * ArrayList
 */
import java.util.*;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1); 
		al.add("�̼���");
		al.add(12.3);
		
		
		for(int inx =0 ; inx < al.size(); inx++) { // �ϳ��� �̾Ƴ���
			System.out.println(al.get(inx).getClass().getName());
			//java.lang.Integer value Ÿ�Ծƴϰ� reference Ÿ����
			//java.lang.String
			//java.lang.Double
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
