package Exercise;

class MyClass extends Object{
	public String toString() { //toString�޼ҵ�� object�޼ҵ���
		return "Myclass";
	}
}


public class ToString {

	public static void main(String[] args) {
		MyClass t =  new MyClass();
		System.out.println(t); // MyClass

	}

}
