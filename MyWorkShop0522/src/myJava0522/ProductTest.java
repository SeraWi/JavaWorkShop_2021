package myJava0522;

class Product{
	static int count = 0;//������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int serialNo;//�ν��Ͻ� ������ ��ȣ
	{//�ν��Ͻ� �ʱ�ȭ ��
		// product�ν��Ͻ��� ������ ������ count�� ���� 1�� �������Ѽ� serialNo�� �����Ѵ�. 
		++count;
		serialNo = count;
	}
	public Product() {} //�⺻ ������
}


public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println("p1�� ��ǰ��ȣ(serial No)�� "+p1.serialNo);//p1�� ��ǰ��ȣ(serial No)�� 1
		System.out.println("p2�� ��ǰ��ȣ(serial No)�� "+p2.serialNo);//p2�� ��ǰ��ȣ(serial No)�� 2
		System.out.println("p3�� ��ǰ��ȣ(serial No)�� "+p3.serialNo);//p3�� ��ǰ��ȣ(serial No)�� 3
		System.out.println("����� ��ǰ�� ���� ���"+ Product.count);//����� ��ǰ�� ���� ���3
	}

}
