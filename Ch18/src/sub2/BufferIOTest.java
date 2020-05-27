package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2020/05/21
 * 이름 : 이성진
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018 
 */
public class BufferIOTest {

public static void main(String[] args) throws Exception {
		
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		//기본 파일입출력 스트림 생성
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		//버퍼스트림 생성 및 연결
		BufferedInputStream  bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {
		    // InputStream으로 데이터 읽어드리이기
			value = bis.read();
			// value == -1 읽을 데이터가 없다는 뜻
			if(value == -1) {
				break;
			}
			
			//OutputStream으로 데이터 내보내기
			bos.write(value);
		}
		
		//스트림 해제(버퍼랑 스트림이랑 둘다 해제해야한다.)
		bis.close();
		bos.close();
		fis.close();
		fos.close();// 순서가 중요하다. 버퍼부터 먼저 날리고 스트림을 날려야 한다. 버퍼는 스트림에 종속되어있다.
					// 스트림만 날리면 버퍼도 같이 날아가긴 하지만, 가독성을 위해서 명확하게 버퍼를 날리는 것을 보여줘야한다.
		
		System.out.println("프로그램 종료...");
	}
}
