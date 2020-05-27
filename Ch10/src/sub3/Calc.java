package sub3;

public class Calc {
	
	// �̱��� ��ü
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
	
	// �ش� �޼���� ������ �߻��� �� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� �ʿ� �˸� 
	public int div(int x, int y) throws Exception { //�׷��� throws�� s
		
		if(y < 0) {
			// ������ �߻��� �� �޼��带 ȣ���ϴ� ������ ������ ������.
			Exception e = new Exception("y�� ��� �̾�� �մϴ�."); //���� 3
			throw e;
		}else if(y == 1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�."); //���� 2
			throw e;
		}
		
		int z = x / y; // ���� 1
		
		return z;
	}
	
	
}
