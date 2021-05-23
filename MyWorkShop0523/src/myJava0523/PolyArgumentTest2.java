package myJava0523;
import java.util.*;
class Product2{
	int price;
	int bonusPoint;
	Product2(){}
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); 
	}
}
class Tv2 extends Product2{
	Tv2(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer2  extends Product2{
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product2{
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i =0;// Product �迭�� ����� ī����

	void buy(Product2 p) {
		if(money <p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -=p.price;
		bonusPoint +=p.bonusPoint;
		item[i++] =p;// ��ǰ�� Product[] item �� �����Ѵ�.
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	void summary() {
		int sum = 0;
		String itemList ="";// ������ ��ǰ ���
		
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i =0; i<item.length;i++) {
			if(item[i]==null) {
				break;
			}
			sum+= item[i].price;
			itemList +=item[i]+",";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
	}

}
