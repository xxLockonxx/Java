package Test09;
/*
 * ��¥: 2020/05/01
 * �̸�: �̼���
 * ����: �ڹ� �� �Ƕ�̵� ��������
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
				
				System.out.println("\n"); // \n �������
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
