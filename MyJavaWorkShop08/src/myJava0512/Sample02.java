package myJava0512;

class BBSItem{
	//int seqNo;
	static int seqNo;// �ٸ� ��ü���� ������ �����ȴ�.-> ��������
	BBSItem(){
		seqNo++;
		System.out.println(seqNo);
	}
}


public class Sample02 {

	public static void main(String[] args) {
		BBSItem b = new BBSItem(); //1  //1
		BBSItem b1 = new BBSItem(); //1,�ٸ� ��ü, �ν��Ͻ� ���� �ٽ� ����(int seqNo;) //2, ����ƽ������ ��� ����
				

	}

}
