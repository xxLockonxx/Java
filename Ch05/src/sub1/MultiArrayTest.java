package sub1;
/*
 * 날짜 : 2020/05/04
 * 이름 : 이성진
 * 제목 : 다차원 배열 실습하기 
 */
public class MultiArrayTest {
	
	public static void main(String[] args) {
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92}; //배열을 이름을 복수로 서줌. 영어라고 생각하면 됨.
		int sum = 0; // 선언만 하고 초기화를 안해주면 에러가 나온다.
		
		for(int i =0 ; i < scores.length ; i++) { //여기서 i < 5로 하는 것보다 scores.length를 사용하는게 낫다.
			sum += scores[i];
		} 
		
		System.out.println("배열 scores의 총합 : "+sum);
		
		for(int score : scores) {
			sum += score;
		}//배열의 반복문으로 한 것임. 이것도 출력하면 위 값이랑 같게 나옴
		
		
		// 2차원 배열 가로가 행 세로가 열 (열맞춰! 생각하자. 오와 열 행열)
		int arr2d[][] = {{1,  2,  3,  4}, 
						 {5,  6,  7,  8}, 
						 {9, 10, 11, 12}};
		
		for(int a = 0 ; a <arr2d.length ; a++ ) {
			for(int b= 0; b<arr2d[a].length ; b++ ) {
				System.out.println("배열 arr2d의"+(a+1)+"행"+(b+1)+"열 원소 : "+arr2d[a][b]);
			}
				
		}
		System.out.println("\n");

		
		// 3차원 배열
		int arr3d[][][] = {{{ 1, 2, 3}, 
			                { 4, 5, 6}, 
			                { 7, 8, 9},
			                {10,11,12}},
				
						   {{13,14,15}, 
			                {16,17,18},
			                {19,20,21},
			                {22,23,24}},
						   
						   {{25,26,27}, 
			                {28,29,30}, 
			                {31,32,33},
			                {34,34,36}}};
		
		System.out.println("3차원 배열 1면1행1열 : "+arr3d[0][0][0]);
		System.out.println("3차원 배열 1면3행3열 : "+arr3d[0][2][2]);
		System.out.println("3차원 배열 2면1행2열 : "+arr3d[1][0][1]);
		System.out.println("3차원 배열 2면3행3열 : "+arr3d[1][2][2]);
		System.out.println("3차원 배열 3면1행3열 : "+arr3d[2][0][2]);
		System.out.println("3차원 배열 3면4행3열 : "+arr3d[2][3][2]);
		System.out.println("\n");
		
		for(int a = 0 ; a <arr3d.length ; a++ ) {
			for(int b= 0; b<arr3d[a].length ; b++ ) {
				for(int c = 0; c<arr3d[a][b].length ; c++) {
				System.out.println("배열 arr3d의"+(a+1)+"면"+(b+1)+"행"+(c+1)+"원소 : "+arr3d[a][b][c]);
				}
			}
				
		}
		
	}
}
