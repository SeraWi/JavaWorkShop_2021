package myJava0520;

import java.util.*;//*:���ϵ� ī��
/*
 * collection framework ����
 * ArrayList
 * getName()
 */

public class Sample02 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("�̼���");
		al.add("������");
		al.add(12.5);
		al.add(false);
		al.set(0,"�������");
		
		Object obj = al.get(0); //������Ʈ Ÿ������ ��ȯ�Ѵ�.Ŭ���� Ÿ��!
		System.out.println(obj.getClass().getName()); // ��ü�� ���� Ÿ������ �˼� �ִ�. java.lang.Integer
		Object obj2 = al.get(1); // String
		System.out.println(obj2.getClass().getName());// java.lang.String
		
		al.size();
		for(int inx = 0; inx <al.size();inx++) {
			Object o =al.get(inx);
			System.out.println(o.toString());
			//System.out.println(al.get(inx));
		}
		HashSet h = new HashSet();
		h.add("ȫ�浿");
		h.add("�̼���");
		h.add("ȫ�浿");
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); //�ߺ����� ���´�. 
		}
		
	}
}
