package test06;
/*
 * ��¥ : 2020/05/13
 * �̸� : �̼���
 * ���� : Ŭ���� ��� ��������
 */
class Rent {
		public void payment() {
				System.out.println("�Ӵ�θ� �޽��ϴ�.");
		}
}

class Landload extends Rent {
		
		public void getMoney() {
				System.out.println("�ǹ��� �Դϴ�.");
				payment();//super�� ��� �ǳ�?
		}
}
public class JavaTest6 {
		public static void main(String[] args) {
			
				Landload master = new Landload();
				master.getMoney();
		}
}
