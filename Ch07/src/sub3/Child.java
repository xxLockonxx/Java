package sub3;

public class Child extends Parent {
	
	// @Override �θ𿡼� final ������ �߱� ������ �θ� ������ �޼���
	// �������̵��� ���� ���� ����.
	/*public void method1() {
		System.out.println("Child - method1...");
	}
	*/
	// �θ�Ŭ���� method1�� final �������� Override�� �� �� ����.��
	
	
	
	@Override
	public void method2() {
		System.out.println("Child - method2...");
	}
	@Override // Overloading���µ� �ҹ迡 int a�� ���ܼ� �ٲ�.
	public void method3(int a) {
		System.out.println("Child - method3...");
	}

}
