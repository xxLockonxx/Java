package sub5;

import java.text.SimpleDateFormat;
import java.util.Date; //main���� date �Է��ϰ� ��Ʈ�� �����̽� �ι�°��

/* 
 * ��¥ : 2020/05/19
 * �̸� : �̼���
 * ���� : Date Ŭ���� �ǽ��ϱ� ���� p538
 */
public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� mm�� dd�� hh:mm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : "+now);
	}
}
