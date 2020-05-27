package sub3;

/*
 * ��¥ : 2020/05/19
 * �̸� : �̼���
 * ���� : ������(Thread) �ǽ��ϱ� ���� p576
 */
public class AddThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		AddThread at1 = new AddThread(1,50);
		AddThread at2 = new AddThread(51,100);
		
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		int total = tot1 + tot2;
		
		System.out.println("��ü ��: "+total);
	}
}
