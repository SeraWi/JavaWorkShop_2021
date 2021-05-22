package myJava0522;
class Data3{
	int x;
}

public class ReferenceReturnEx {
	
	static Data3 copy(Data3 d) {// 데이터 타입으로 받아서 데이터 타입으로 반환
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	}
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x= 10;
		
		Data3 d2= copy(d);
		System.out.println(d.x);
		System.out.println(d2.x);
		
	}
}
