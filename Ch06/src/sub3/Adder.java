package sub3;

public class Adder { //멤버 5개 (멤버변수 1개, 멤버함수 4개)

	// 멤버 변수
	private int x; //default값은 public
	
	// 생성자
	Adder(int x){
		this.x =x;
	}
	
	// getter, setter
	//  - 외부에서 멤버변수에 대한 직접참조가 필요할 경우 사용하는 메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	//변수만 다르고 이름 같은 함수 => 오버로드 함수
	public void add(int x) {
		this.x = x + 50;
	} 
	public void add(int[] arr) {
		arr[0]++;
	}
	public void add(Adder a1) {
		int x = a1.getX() + 40;   //a1.x = a1.x + 40;
		a1.setX(x);
	}
	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
	}
	
	
}
