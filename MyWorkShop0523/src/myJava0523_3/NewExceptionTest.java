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
			throw new SpaceException("설치할 공간이 부족합니다. ");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException ex){
			System.out.println(ex.getMessage());
			System.out.println("공간을 화보한 후에 다시 설치하시기 바랍니다.");
		}catch(MemoryException ex) {
			System.out.println(ex.getMessage());
			System.out.println("다시 설치를 시도하세요.");
		}finally {
			deleteTempFiles();
		}
	}
}
