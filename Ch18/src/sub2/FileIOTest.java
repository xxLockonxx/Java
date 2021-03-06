package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2020/05/21
 * 이름 : 이성진
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018 
 */
public class FileIOTest {

	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\rabbit.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		
		while(true) {
		    // InputStream으로 데이터 읽어드리이기
			value = fis.read();
			// value == -1 읽을 데이터가 없다는 뜻
			if(value == -1) {
				break;
			}
			
			//OutputStream으로 데이터 내보내기
			fos.write(value);
		}
		
		// 스트림 해제(연결된 자원 반납)
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료...");
	}
}
