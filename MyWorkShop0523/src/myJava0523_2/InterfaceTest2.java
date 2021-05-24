package myJava0523_2;

interface I{
	public abstract void play();
}
class B2 implements I{
	@Override
	public void play() {
		System.out.println("play in B class");
	}
}
class C implements I{
	@Override
	public void play() {
		System.out.println("play in C class");
	}
}
class A2{
	void autoPlay(I i) {
		i.play();
	}
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2()); //play in B class
		a.autoPlay(new C());  //play in C class
	}
}
