package sub3;

public class Calc {
	
	// 싱글톤 객체
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	// 해당 메서드는 에러가 발생할 수 있다는 가능성을 throws 선언을 통해 호출하는 쪽에 알림 
	public int div(int x, int y) throws Exception { //그래서 throws의 s
		
		if(y < 0) {
			// 에러가 발생할 때 메서드를 호출하는 족으로 에러를 던진다.
			Exception e = new Exception("y가 양수 이어야 합니다."); //에러 3
			throw e;
		}else if(y == 1) {
			Exception e = new Exception("y가 1이 되면 안됩니다."); //에러 2
			throw e;
		}
		
		int z = x / y; // 에러 1
		
		return z;
	}
	
	
}
