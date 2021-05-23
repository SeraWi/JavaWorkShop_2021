package myJava0523_3;
class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}

public class NewExceptionTest {
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�. ");
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		}
	}
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException ex){
			System.out.println(ex.getMessage());
			System.out.println("������ ȭ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}catch(MemoryException ex) {
			System.out.println(ex.getMessage());
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		}finally {
			deleteTempFiles();
		}
	}
}
