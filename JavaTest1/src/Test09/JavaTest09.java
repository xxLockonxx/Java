package Test09;
/*
 * 날짜: 2020/05/01
 * 이름: 이성진
 * 내용: 자바 별 피라미드 연습문제
 */
public class JavaTest09 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0 ; i < n ; i++) {
				
				for(int j = n-1 ; j > i ; j--) {
					System.out.print(" ");
				}
				
				for(int j = 0 ; j < 2 * i + 1 ; j++) {
					System.out.print("*");
				}
				
				System.out.println("\n"); // \n 기억하자
		}
		
		for(int i = 0 ; i < 5 ; i++) {
				
				for(int j = 0 ; j < 4-i ; j++) {
					System.out.print(" ");
				}
				
				for(int j = 0 ; j < 2 * i + 1 ; j++) {
					System.out.print("*");
				}
				
				System.out.println("\n");
		}
		
	}
}
