package sub4;
/*
 * ���� : 2020/05/12
 * �̸� : �̼���
 * ���� : ������(Polymorphism) �ǽ��ϱ� ���� p305
 * 
 * �������̵�(Override)
 *  - �θ�Ŭ������ ��� �޼��带 �ڽ�Ŭ�������� �ٽ� ���� �ϴ� ��.(������) 
 *  - �ڽ�Ŭ������ �ٽ� ������ �ż���� �θ�Ŭ������ �޼��带 �����.(��������.)
 *  
 * ������
 * 	- ��Ӱ��迡 �ִ� Ŭ�������� �θ�Ŭ������ ��ü���� ������ ��ӹ޴� �ڽ�Ŭ������ ���ϴ� ����
 *  - �θ�Ŭ������ Ÿ������ ��ü�� �����ϴ� ��
 * 
 * 
 */
public class PolyTest {
	
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark(); //������ ������ ������ ǥ���� 
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt(); //Animal a1 = new Tiger(); �� �ƴ϶� Tiger a1 = new Tiger();�� �����ϸ� ����.
		a2.hunt(); //Animal�� ¡�˴ٸ� ���ҷ� �׳� ������� hunt �޼��� ������ �ϸ� �ȴ�.
		a3.hunt();
		
		// ������ Ȱ��
		Tiger ani1 = new Tiger();
		Eagle ani2 = new Eagle();
		Shark ani3 = new Shark();
		//�迭�� ���� Ÿ���� �����͵鸸 �����ؼ� ������ ��.
		Animal arr[] = {ani1,ani2,ani3};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
	}
}














