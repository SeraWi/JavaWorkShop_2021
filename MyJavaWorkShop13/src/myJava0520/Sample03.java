package myJava0520;
/*
 * generic
 * 타입 캐스팅 할 필요없다.
 */

class Student2<T>{
	T s;
	Student2(T s){
		this.s = s;
	}
	public T getS() {
		return this.s;
	}
}


public class Sample03 {
	public static void main(String[] args) {
		Student2<String> stu = new Student2<String>("이순신");
		System.out.println(stu.getS());//이순신
	}
}
