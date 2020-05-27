package sub4;

public class Calc {

	// 싱글톤 객체
	private static Calc instance = new Calc();
		
	public static Calc getInstance() {
		return instance;
	}
	
	// new로 해서  heap에서 생상하지 못하고 위에 꺼로 method area에서만 참조할 수 있겠끔 만드는 방법
	private Calc() {
		
	}

	public int plus(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}

	public int multi(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}
}

