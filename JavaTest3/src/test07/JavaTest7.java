package test07;
/*
 * ��¥ : 2020/05/13
 * �̸� : �̼���
 * ���� : Ŭ���� ��� ��������
 */
public class JavaTest7 {
		public static void main(String[] args) {
				Customer kim = new Customer(1001, "������");
				VipCustomer lee = new VipCustomer(1002, "�̼���");
				
				System.out.println("�����ߴ��� ������ �ݾ� : "+kim.calcPrice(10000));
				System.out.println("�̼��Ŵ��� ������ �ݾ� : "+lee.calcPrice(10000));
				
				kim.showInfo();
				lee.showInfo();
		}
}
