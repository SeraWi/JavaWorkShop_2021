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
		MyData m1 = new MyData(new String("이순신"));
		String o1 = (String) m1.getA(); //캐스팅해줘야!=>불편하다!
		
		
		MyData<Integer> m2 = new MyData<Integer>(10);
		Integer i = m2.getA();// 캐스팅 안해줘도 된다. 
		MyData<String> m3 = new MyData<String>("이순신");
		String s2 = m3.getA();
	}

}
