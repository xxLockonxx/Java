package sub3;

public class Parent extends GrandParent {

	@Override //�̷��� �������̵��� ������̼��� �޾��ش�.
	public final void method1() {
		System.out.println("Parent - method1...");
	}
	
	// Overloading
	public void method2(int a) {
		System.out.println("Parent - method2...");
	}
	
	// �ҹ迡�� int a ������ �� �ƴ� @Override //��� ���� ������ �ּ���.
	public void method3() {
		System.out.println("Parent - method3...");
	}
}
