package sub1;

/*
 * 날짜 : 2020/05/06
 * 이름 : 이성진
 * 제목 : 메서드 타입 실습하기 
 */
public class MethodTypeTest {
	
	// 자바 프로그램 시작 메서드
	public static void main(String[] args) {
		
		// 메서드 호출(실행)
		double r1 = type1(1.1);
		System.out.println("r1 : "+r1);
		
		type2(true);
		
		boolean r2 = type3();
		System.out.println("r2 : "+r2);
		
		type4(); 
		
		//연습문제
		gugudan(2);
		gugudan(5);
		gugudan(7);
		
		
	} // main end
	
	// type1 : 매개변수 o , 리턴값 o
	public static double type1(double a) {
		double result = a + 3.14;
		return result;
	}

	// type2 : 매개변수 o , 리턴값 x
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	// type3 : 매개변수 x , 리턴값 o
	public static boolean type3() {
		
		int num1 = 1, num2 = 2;
		
		if (num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// type4 : 매개변수 x , 리턴값 x
	public static void type4() {
		System.out.println("type1(0.1) : "+type1(0.1));
	}
	
	// 연습문제 구구단
	public static void gugudan(int x) {	
		System.out.println(+x+"단");
		
		for(int y = 1 ; y <=9 ; y++) {
			System.out.println(x+" x "+y+" = "+x*y);
		}
	}
	
}







