package sub3;
/*
 * 날자 : 2020/05/12
 * 이름 : 이성진
 * 내용 : 오버라이드 메서드 실습하기 교재 p295
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		// final
		// - final 변수    : 상수
		// - final 메서드 : 오버라이드 금지
		// - final 클래스 : 상속금지		
		final int NUM = 1; //C++에서는 const
		final double PI = 3.14;
		// NUM = 2; 상수는 처음 초기화된 값으로 고정된다. 대문자로 표기. 
		
		
		
		
	}
}
