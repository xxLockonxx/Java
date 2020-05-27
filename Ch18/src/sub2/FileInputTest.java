package sub2;

import java.io.FileInputStream;

/*
 * 날짜 : 2020/05/21
 * 이름 : 이성진
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018 
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		
		//파일이 밖에 없을 수도 있기 때문에 예외처리(try catch)를 해야함.
	try {
		FileInputStream fis = new FileInputStream(file); //여기서 연결
		int value = 0;
		while(true ) {
			
			value = fis.read();
			
			if(value == -1) {
				// 더 이상 읽어들일 파일이 없다.
				break;
			}
			
			char c = (char) value;
			System.out.print(c);
		}
		
		// 입력스트림 해제
		fis.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n프로그램 종료...");
	}
}
