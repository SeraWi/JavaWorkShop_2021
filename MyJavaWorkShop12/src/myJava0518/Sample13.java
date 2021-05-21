package myJava0518;

import java.util.ArrayList;
class MyDataType{
	
}
interface MyData2<T>{
	T add(T a);
}
class MyData3<T> implements MyData2<T>{
	public T add(T a) {
		return null;
	}
}
public class Sample13 {

	public static void main(String[] args) {
	
		ArrayList<String>al2 = new ArrayList<String>();
		//al2.add(1);String 아니라서 에러
		 al2.add("1");
	
				
	
	}
	

}
