package sub2;
/* 
 * 날짜 : 2020/05/18
 * 이름 : 이성진
 * 내용 : String 멤버 실습하기 교재 p496
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		// length - 문자열의 길이(문자갯수)빈칸도 문자로 계산한다.
		System.out.println("str 문자열 길이 : "+str.length());
		
		// charAt - 문자열에서 특정문자 추출
		System.out.println("str의 6번째 문자 : "+str.charAt(6));
		
		// substring - 문자열 자르기
		System.out.println("str의 0번에서 5번까지 문자열 : "+str.substring(0, 5));
		System.out.println("str의 6번에서 마지막까지 문자열 : "+str.substring(6));
		
		// indexOf, lastIndexOf - 문자열에서 문자 인덱스번호 추출
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("문자열 str에서 앞에서 부터  문자 e의 인덱스값 : "+idx1);
		System.out.println("문자열 str에서 뒤에서 부터 문자 e의 인덱스값 : "+idx2);
		
		// replace
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newStr);
		
		// valueOf
		int		 var1 = 1;
		double   var2 = 2.13;
		boolean  var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
		
	}
}
