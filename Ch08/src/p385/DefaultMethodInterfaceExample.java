package p385;

import p384.ChildInterface3;

public class DefaultMethodInterfaceExample {
	public static void main(String[] args) {

		ChildInterface3 ci3 = new ChildInterface3() {
	
			@Override
			public void method1() {/*���๮*/}
	
			@Override
			public void method2() {/*���๮*/}
	
			@Override
			public void method3() {/*���๮*/}
			
		};
		
		ci3.method1();
		ci3.method2(); //ChildInterface3 ���� ��ü�� method2()ȣ��
		ci3.method3();
	}
}
