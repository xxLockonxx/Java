package sub2;

public class Account {
	// 특성(멤버변수)
	// - 접근권한 private 선언으로 무조건 캡슐화 한다.
	private String bank;
	private String id;
	private String name;
	private int money;
	
	//생성자 (이제 외부에서 초기화하는 데이터가 들어와도 된다.)
	// : 객체를 생성 할 때 멤버변수를 초기화하는 메서드
	Account(String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 기능(메서드)
	public void deposit(int money) {
		this.money += money; //간단하게 하자면 그냥 이름을 다르게 설정해서 해도 된다. this는 Account클래스를 지칭한다. 거기에 있는 money에를 봐라
		
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("은 행 명 : "+bank); //멤버변수 이름에 중복되지 않으면 구지 this를 쓸필요가 없다.
		System.out.println("계좌번호 : "+id);
		System.out.println("입 급 주 : "+name);
		System.out.println("현재잔액 : "+money);
	}
}
