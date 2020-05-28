package sub1;
/*
 * ��¥ : 2020/05/28
 * �̸� : �̼���
 * ���� : ���ٽ� �ǽ��ϱ� ���� p678 
 */
public class LambdaTest {
	public static void main(String[] args) {
		// ���ٽ� : �������̽��� Ȱ���� �ڵ���� ���� �͸��Լ�
		Type1 t1 = ()->{
			System.out.println("Type1 ���ٽ� ����...");
		};
		
		t1.f();
		
		Type2 t2 = (x)->{
			System.out.println("Type2 x : "+x);
		};

		t2.f(5);
		
		Type3 t3 = (x,y)->{
			return x + y;
		};
		
		int result = t3.f(2, 3);
		System.out.println("result : "+result);
	}
}
