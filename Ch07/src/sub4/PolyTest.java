package sub4;
/*
 * 날자 : 2020/05/12
 * 이름 : 이성진
 * 내용 : 다형성(Polymorphism) 실습하기 교재 p305
 * 
 * 오버라이드(Override)
 *  - 부모클래스의 멤버 메서드를 자식클래스에서 다시 정의 하는 것.(재정의) 
 *  - 자식클래스의 다시 정의한 매서드로 부모클래스의 메서드를 덮어쓴다.(가려진다.)
 *  
 * 다형성
 * 	- 상속관계에 있는 클래스에서 부모클래스의 구체적인 내용이 상속받는 자식클래스로 변하는 성질
 *  - 부모클래스의 타입으로 객체를 선언하는 것
 * 
 * 
 */
public class PolyTest {
	
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark(); //다형성 문법을 적용한 표현법 
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt(); //Animal a1 = new Tiger(); 가 아니라 Tiger a1 = new Tiger();로 선언하면 가능.
		a2.hunt(); //Animal에 징검다리 역할로 그냥 내용없는 hunt 메서드 선언을 하면 된다.
		a3.hunt();
		
		// 다형성 활용
		Tiger ani1 = new Tiger();
		Eagle ani2 = new Eagle();
		Shark ani3 = new Shark();
		//배열은 같은 타입의 데이터들만 나열해서 저장한 것.
		Animal arr[] = {ani1,ani2,ani3};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
	}
}














