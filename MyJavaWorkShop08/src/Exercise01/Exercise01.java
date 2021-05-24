package Exercise01;
/*
 * 페이지 371
 * 객체를 배열로 다루기
 */

class Product{
	int price;
	int bonuspoint;
	Product(){} // default 생성자
	Product(int price){// 생성자
		this.price = price;
		bonuspoint = (int)(price/10.0); //보너스 포인트 계산
	}
}

class Tv extends Product{
	Tv(){// Tv 생성자
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
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -=p.price;
		bonuspoint += p.bonuspoint;
		item[i++] = p;
		System.out.println(p+"을 구입하셨습니다.");
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
			System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다.");
			System.out.println("구입하신 제품은 "+itemList+"입니다.");
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
