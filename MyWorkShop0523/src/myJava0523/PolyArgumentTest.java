package myJava0523;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint =(int)( price/ 10.0 );// 보너스 점수는 제품가격의 10분의 1
		
	}
}
class Tv extends Product{
	Tv(){
		super(100);// 조상클래스의 생성자 Product(int price)를 호출하고 100만원으로 설정
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Buyer{
	int money =  1000;// 소유금액
	int bonusPoint = 0;// 보너스 점수 0으로 설정
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; // 종료
		}
		money -=p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다. ");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		System.out.println("현재 남은 돈은 "+b.money+"입니다. ");
		System.out.println("현재 포인트는 "+b.bonusPoint+"입니다");
	}

}
