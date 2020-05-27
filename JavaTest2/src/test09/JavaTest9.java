package test09;
/*
 * 날짜 : 2020/05/07
 * 이름 : 이성진
 * 내용 : 자바 자료구조 스택(Stack) 연습문제
 */
public class JavaTest9 {
	
	static int STACK_SIZE = 10;
	static int stack[] = new int[STACK_SIZE];
	static int top = 0;
	
	public static void main(String[] args) {
		
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop()); //더이상 뺄께 없으니까 이렇게 말하는 거임.
	}
	
	public static void push(int data) {
		if (top == STACK_SIZE) {
			System.out.println("더이상 데이터를 저장할 수 없습니다.");
		}
		stack[top++] = data;
	}
	
	public static int pop() {
		if (top == 0) {
			System.out.println("데이터가 없습니다.\n");
			return 0;
		}
		return stack[--top]; // 역시 앞에서 아까 처럼 먼저 만들어 주고 빼는거 빼고 해당꺼 pop하기
	}
	

}
