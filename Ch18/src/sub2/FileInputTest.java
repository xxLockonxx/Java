package sub2;

import java.io.FileInputStream;

/*
 * ��¥ : 2020/05/21
 * �̸� : �̼���
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018 
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		
		//������ �ۿ� ���� ���� �ֱ� ������ ����ó��(try catch)�� �ؾ���.
	try {
		FileInputStream fis = new FileInputStream(file); //���⼭ ����
		int value = 0;
		while(true ) {
			
			value = fis.read();
			
			if(value == -1) {
				// �� �̻� �о���� ������ ����.
				break;
			}
			
			char c = (char) value;
			System.out.print(c);
		}
		
		// �Է½�Ʈ�� ����
		fis.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n���α׷� ����...");
	}
}
