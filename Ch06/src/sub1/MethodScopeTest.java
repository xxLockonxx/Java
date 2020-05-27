package sub1;
/*
 * 날짜 : 2020/05/06
 * 이름 : 이성진
 * 제목 : 자바 메서드(함수) 실행영역과 메모리 실습하기 
 */
public class MethodScopeTest {
	
	// 전역변수(전지역 변수)
	//static int result = 0; //static으로 맞춰줘야 하긴 한다. 
	
	public static void main(String[] args) {
		
		// 지역변수
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		System.out.println("result : "+result);
	} // main end

	public static int sum(int s, int e) {
		
		// 지역변수
		int sum = 0;
		
		for(int k=s ; k<=e ; k++) {
			sum += k;
		}
		
		return sum; 
	}

}


