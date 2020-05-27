package sub2;
/*
 * 날짜: 2020/04/29
 * 이름: 이성진
 * 내용: 변수의 자료형(데이터 타입) 실습하기
 */
public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형
		byte  var1 = 127; // 맥시멈 127까지 저장 128 저장 불가 1byte = 8bit 2의 0승 부터 2의 6승까지 더하면 127
		short var2 = 2; // 
		int   var3 = 2147483647; //여기까지 저장가능
		long  var4 = 4;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		// 실수형
		float  var5 = 1.123456789f; // 끝에 f 꼭 붙여줘야 함 귀찮음. 소숫점뒤로 7자리까지 밖에 안나와서 
		double var6 = 1.23456789123456789; // 두개는 크기차이 16자리까지 나옴.
		
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		
		// 논리형
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		
		// 문자형
		char ch1 = 'A'; //단어 안됨. //따옴표 한개
		char ch2 = '가'; 
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		// 문자열(단어)
		String str1 = "Apple";
		String str2 = "Hello";
		String str3 = "안녕";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
		
		
	}
	
}
