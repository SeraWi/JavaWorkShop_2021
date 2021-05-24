package myJava0512;

class BBSItem{
	//int seqNo;
	static int seqNo;// 다른 객체더라도 변수가 공유된다.-> 공유변수
	BBSItem(){
		seqNo++;
		System.out.println(seqNo);
	}
}


public class Sample02 {

	public static void main(String[] args) {
		BBSItem b = new BBSItem(); //1  //1
		BBSItem b1 = new BBSItem(); //1,다른 객체, 인스턴스 변수 다시 생성(int seqNo;) //2, 스태틱변수는 계속 유지
				

	}

}
