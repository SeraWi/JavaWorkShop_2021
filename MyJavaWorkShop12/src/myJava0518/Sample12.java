package myJava0518;

class MyData<T>{
	private T a;
	MyData(T a){
		this.a = a;
	}
	public T getA() {
		return this.a;
	}
}

public class Sample12 {

	public static void main(String[] args) {
		
		MyData m = new MyData(11);
		Object o = m.getA();
		MyData m1 = new MyData(new String("�̼���"));
		String o1 = (String) m1.getA(); //ĳ���������!=>�����ϴ�!
		
		
		MyData<Integer> m2 = new MyData<Integer>(10);
		Integer i = m2.getA();// ĳ���� �����൵ �ȴ�. 
		MyData<String> m3 = new MyData<String>("�̼���");
		String s2 = m3.getA();
	}

}
