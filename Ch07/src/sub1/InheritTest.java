package sub1;
/*
 * ��¥ : 2020/05/12
 * �̸� : �̼���
 * ���� : Ŭ���� ��� �ǽ��ϱ� 
 */
public class InheritTest {

	public static void main(String[] args) {
		
		Account nh = new Account("����", "121-11-1111", "������", 10000);
		nh.deposit(10000);
		nh.withdraw(5000);
		
		nh.info();
		
		StockAccount kb = new StockAccount("��������", "212-12-1234", "ȫ�浿", 10000, "�Ｚ����" , 100, 30000);
		kb.deposit(3050000);
		kb.withdraw(7000);
		kb.buy(100);
		kb.sell(10);
		
		kb.info();
	
	
	
	
	}
}
