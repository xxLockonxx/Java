package sub3;
/*
 * ��¥: 2020/05/14
 * �̸�: �̼���
 * ����: ���� ���ѱ�� �ǽ��ϱ� ���� p433
 */
public class ThrowsTest {
	public static void main(String[] args) throws Exception {
		
		// �̱��� ��ü ������
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		
		// ������ �߻��� throws ����� �޼��带 ȣ���ϴ� �ʿ����� ����ó��(try-catch)�� �ؾ���.
		// �Ǵ� �ٽ� throws �������� main�� ȣ���ϴ� �ڹ� JVM���� ���ܸ� ����
		int r4 = c.div(4, 1);
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("���α׷� ����...");
		
		
		
		
	}
}
