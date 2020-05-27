package Test01;
/*
 * 날짜: 2020/05/01
 * 이름: 이성진
 * 내용: 자바 데이터 타입 연습문제
 */
public class JavaTest01 {
	public static void main(String[] args) {
		char    var1 = 'A';
		int     var2 = 100;
		long    var3 = 2147483648L; //Java에서만 L을 꼭 붙여줘야 됨. int 2147483647까지만 담을 수 있음.
		float   var4 = 3.14f;
		double 	var5 = 3.14159;
		boolean var6 = true;
		boolean var7 = false;
		String  var8 = "Hello"; // String은 대문자를 꼭적어야함.
		String  var9 = null; // null은 String밖에 처리할수 없음. String은 객체임. 객체를 초기화하는것. String 대신 Object를 써도 됨.
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
	}

}
