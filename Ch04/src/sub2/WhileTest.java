package sub2;
/*
 * 날짜 : 2020/05/04
 * 이름 : 이성진
 * 제목 : 반복문 while 실습하기 
 */
public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
				
		while(k <= 10) {
			sum += k;
			k++; // sum += k; 뒤에 붙는지 아닌지에 따라 전위후위연산으로 달라짐. 그리고 이거 없으면 무한루프에 빠짐.
						
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// do ~ while
		int eSum = 0;
		int i = 1;
		
		do { 
			if(i % 2 == 0){
				eSum += i;	
			}
			i++;
		}
		while(i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : "+eSum);
		
		
		// break
		int num = 0; //선언 declare 초기화 initialize
		
		while(true) {
			
			num++;
			
			if(num%5==0 && num%7==0) {
				break; // 반복문을 탈출하는 키워드
			}
		}
			
		System.out.println("5와 7의 최소공배수 : "+num);
			
		// continue
		int total = 0;
		
		for(int j=1 ; j<=10 ; j++) {
			
			if(j % 2 == 1) {
				continue; //반복문의 상위로 이동 일종의 필터역할. j값이 홀수이면 걸러버림
			}
		
			total += j;
			
		}
		
		System.out.println("1부터 10까지 짝수합 : "+total);
		
		
	}
}
