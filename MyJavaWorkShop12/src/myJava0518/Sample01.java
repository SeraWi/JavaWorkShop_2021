package myJava0518;
/*
 * 5월 18일 화요일 
 * 복습
 * equals(); 
 */
class Person{
	int a;
	Person(int a){
		this.a = a;
	}
	public boolean equals(Object obj) {// 오버라이딩
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			return this.a == p.a;
		}else {
			return false;
		}
	}
	public String toString() {
		return this.getClass().getName()+"클래스 입니다.";
	}
}
public class Sample01 {

	public static void main(String[] args) {
		Person p1 = new Person(10);
		Person p2 = new Person(10);
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // true 객체비교
		System.out.println(p1);//myJava0518.Person클래스 입니다.
		System.out.println(p2);//myJava0518.Person클래스 입니다.
	}

}
