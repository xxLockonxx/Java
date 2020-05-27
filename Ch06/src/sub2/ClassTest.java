package sub2;
/*
 * 날짜 : 2020/05/07
 * 이름 : 이성진
 * 제목 : 자바 클래스 실습하기 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		
		// 국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);
		
		// 국민은행 객체생성
		/*Account kb = new Account();*/
		
		/* 초기화(initialize) 
		kb.bank  = "국민은행";
		kb.id    = "121-12-1234";
		kb.name  = "김춘추";
		kb.money = 10000; */ //생성자 만들고 나면 이제 이렇게 만들지 않고 맨위에 꺼처럼 한다.
		
		// 입금, 출금하기
		kb.deposit(10000);
		kb.withdraw(5000);
		// kb.money--; private 설정해줬더니 이런게 불가능 //객체 멤버변수의 캡슐화를 통한 취약코드 예방
		kb.info();
		
		//신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "121-11-1234", "김유신", 30000);
		
		/*신한은행 객체생성
		Account sh = new Account(); */
		
		/*초기화
		sh.bank  = "신한은행";
		sh.id    = "121-11-1234";
		sh.name  = "김유신";
		sh.money = 30000;*/
		
		// 입금, 출금하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
		
		
	}
}
