package p383;

public class DefaultMethodInterfaceExample {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {/*���๮*/}

			@Override
			public void method3() {/*���๮*/}
		};
		
		ci1.method1();
		ci1.method2(); //ParentInterface�� method2 ȣ��
		ci1.method3();
	}
}
