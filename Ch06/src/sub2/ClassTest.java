package sub2;
/*
 * ��¥ : 2020/05/07
 * �̸� : �̼���
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		
		// �������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-12-1234", "������", 10000);
		
		// �������� ��ü����
		/*Account kb = new Account();*/
		
		/* �ʱ�ȭ(initialize) 
		kb.bank  = "��������";
		kb.id    = "121-12-1234";
		kb.name  = "������";
		kb.money = 10000; */ //������ ����� ���� ���� �̷��� ������ �ʰ� ������ ��ó�� �Ѵ�.
		
		// �Ա�, ����ϱ�
		kb.deposit(10000);
		kb.withdraw(5000);
		// kb.money--; private ����������� �̷��� �Ұ��� //��ü ��������� ĸ��ȭ�� ���� ����ڵ� ����
		kb.info();
		
		//�������� ��ü���� �� �ʱ�ȭ
		Account sh = new Account("��������", "121-11-1234", "������", 30000);
		
		/*�������� ��ü����
		Account sh = new Account(); */
		
		/*�ʱ�ȭ
		sh.bank  = "��������";
		sh.id    = "121-11-1234";
		sh.name  = "������";
		sh.money = 30000;*/
		
		// �Ա�, ����ϱ�
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
		
		
	}
}
