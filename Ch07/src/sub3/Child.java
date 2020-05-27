package sub3;

public class Child extends Parent {
	
	// @Override 부모에서 final 선언을 했기 때문에 부모께 마지막 메서드
	// 오버라이들을 당할 수가 없음.
	/*public void method1() {
		System.out.println("Child - method1...");
	}
	*/
	// 부모클래스 method1에 final 선언으로 Override를 할 수 없다.ㅏ
	
	
	
	@Override
	public void method2() {
		System.out.println("Child - method2...");
	}
	@Override // Overloading였는데 할배에 int a가 생겨서 바꿈.
	public void method3(int a) {
		System.out.println("Child - method3...");
	}

}
