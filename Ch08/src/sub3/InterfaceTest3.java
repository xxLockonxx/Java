package sub3;
/*
 * ��¥ : 2020/05/13
 * �̸� : �̼��� 
 * ���� : �������̽� �ǽ��ϱ�
 * */
public class InterfaceTest3 {
	public static void main(String[] args) {
		// �������̽� ���� : ��ü���� ���յ��� ���ߴ� ����
		Bulb bulb = new Bulb();
		Cable socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}
}
