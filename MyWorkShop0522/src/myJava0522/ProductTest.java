package myJava0522;

class Product{
	static int count = 0;//생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;//인스턴스 고유의 번호
	{//인스턴스 초기화 블럭
		// product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다. 
		++count;
		serialNo = count;
	}
	public Product() {} //기본 생성자
}


public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println("p1의 제품번호(serial No)는 "+p1.serialNo);//p1의 제품번호(serial No)는 1
		System.out.println("p2의 제품번호(serial No)는 "+p2.serialNo);//p2의 제품번호(serial No)는 2
		System.out.println("p3의 제품번호(serial No)는 "+p3.serialNo);//p3의 제품번호(serial No)는 3
		System.out.println("생산된 제품의 수는 모두"+ Product.count);//생산된 제품의 수는 모두3
	}

}
