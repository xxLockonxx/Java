package p384;

public class DefaultMethodInterfaceExample {
	public static void main(String[] args) {
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {/*���๮*/}
	
			@Override
			public void method3() {/*���๮*/}
		};
		
		ci2.method1();
		ci2.method2(); //ChildInterface2dml method2()ȣ��
		ci2.method3();
	}
}