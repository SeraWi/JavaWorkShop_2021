package myJava0522_2;

class Point2{
	int x= 10;
	int y =20;
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Point3D extends Point2{
	int z = 30;
	Point3D(){
		this(100,200,300);//Point3D(intx, inty,intz)ȣ��
	}
	Point3D(int x, int y, int z){
		super(x,y); //Point(x,y)ȣ��
		this.z= z;
	}
}


public class PointTest2 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);
	}
}