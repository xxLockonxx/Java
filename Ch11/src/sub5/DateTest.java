package sub5;

import java.text.SimpleDateFormat;
import java.util.Date; //main에서 date 입력하고 컨트롤 스페이스 두번째꺼

/* 
 * 날짜 : 2020/05/19
 * 이름 : 이성진
 * 내용 : Date 클래스 실습하기 교재 p538
 */
public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh:mm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : "+now);
	}
}
