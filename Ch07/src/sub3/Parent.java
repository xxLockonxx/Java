package sub3;

public class Parent extends GrandParent {

	@Override //이렇게 오버라이드라고 어노테이션을 달아준다.
	public final void method1() {
		System.out.println("Parent - method1...");
	}
	
	// Overloading
	public void method2(int a) {
		System.out.println("Parent - method2...");
	}
	
	// 할배에게 int a 넣으면 얘 아님 @Override //기능 없음 일종의 주석임.
	public void method3() {
		System.out.println("Parent - method3...");
	}
}
