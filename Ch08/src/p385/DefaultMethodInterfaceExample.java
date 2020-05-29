package p385;

import p384.ChildInterface3;

public class DefaultMethodInterfaceExample {
	public static void main(String[] args) {

		ChildInterface3 ci3 = new ChildInterface3() {
	
			@Override
			public void method1() {/*실행문*/}
	
			@Override
			public void method2() {/*실행문*/}
	
			@Override
			public void method3() {/*실행문*/}
			
		};
		
		ci3.method1();
		ci3.method2(); //ChildInterface3 구현 객체의 method2()호출
		ci3.method3();
	}
}
