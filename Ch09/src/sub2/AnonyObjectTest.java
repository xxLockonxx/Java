package sub2;
/*
 * ��¥: 2020/05/14
 * �̸�: �̼���
 * ����: �͸�ü �ǽ��ϱ� ���� p404
 */
public class AnonyObjectTest {
	public static void main(String[] args) {
		
		//�͸�ü - �������̽��� Ŭ���� �������� �ٷ� new�������� ��ü�� �����ϴ� ��
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		
		p.info();
		p.hello();
		
		
	}
}
