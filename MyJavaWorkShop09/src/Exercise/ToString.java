package Exercise;

class MyClass extends Object{
	public String toString() { //toString메소드는 object메소드임
		return "Myclass";
	}
}


public class ToString {

	public static void main(String[] args) {
		MyClass t =  new MyClass();
		System.out.println(t); // MyClass

	}

}
