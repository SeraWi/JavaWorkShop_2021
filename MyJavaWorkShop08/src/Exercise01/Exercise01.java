package Exercise01;
/*
 * ������ 371
 * ��ü�� �迭�� �ٷ��
 */

class Product{
	int price;
	int bonuspoint;
	Product(){} // default ������
	Product(int price){// ������
		this.price = price;
		bonuspoint = (int)(price/10.0); //���ʽ� ����Ʈ ���
	}
}

class Tv extends Product{
	Tv(){// Tv ������
		super(100);
		//public String toString() {
		//	return "TV";
		//}
	}
class Computer extends Product{
	Computer(){
		super(200);
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
}

class Buyer{
	int money =1000;
	int bonuspoint =0;
	Product[]item = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -=p.price;
		bonuspoint += p.bonuspoint;
		item[i++] = p;
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	void summary() {
		int sum =0;
		String itemList ="";
		for(int i=0; i<item.length;i++) {
			if(item[i]==null) 
				break;
				sum += item[i].price;
				itemList += item[i]+",";
			}
			System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
			System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
		}
	}
}

//public class Exercise01 {
//
//	public static void main(String[] args) {
//		Buyer b = new Buyer();
//		
//		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.summary();
//
//	}
//
//}
//}
