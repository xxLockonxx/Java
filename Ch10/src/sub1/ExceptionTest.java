package sub1;
/*
 * ��¥: 2020/05/14
 * �̸�: �̼���
 * ����: ����ó�� �ǽ��ϱ� ���� p422
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		try {
			// ������ �߻��� ���ɼ��� �ִ� ����
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		}catch (Exception e) {
			//������ �߻������� ó���� ����
			e.printStackTrace();
			System.out.println("�������� 0���� �� �� �����ϴ�.");
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("���α׷� ����...");
	}
}
