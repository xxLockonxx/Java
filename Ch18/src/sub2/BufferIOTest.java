package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��¥ : 2020/05/21
 * �̸� : �̼���
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018 
 */
public class BufferIOTest {

public static void main(String[] args) throws Exception {
		
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		//�⺻ ��������� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		//���۽�Ʈ�� ���� �� ����
		BufferedInputStream  bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {
		    // InputStream���� ������ �о�帮�̱�
			value = bis.read();
			// value == -1 ���� �����Ͱ� ���ٴ� ��
			if(value == -1) {
				break;
			}
			
			//OutputStream���� ������ ��������
			bos.write(value);
		}
		
		//��Ʈ�� ����(���۶� ��Ʈ���̶� �Ѵ� �����ؾ��Ѵ�.)
		bis.close();
		bos.close();
		fis.close();
		fos.close();// ������ �߿��ϴ�. ���ۺ��� ���� ������ ��Ʈ���� ������ �Ѵ�. ���۴� ��Ʈ���� ���ӵǾ��ִ�.
					// ��Ʈ���� ������ ���۵� ���� ���ư��� ������, �������� ���ؼ� ��Ȯ�ϰ� ���۸� ������ ���� ��������Ѵ�.
		
		System.out.println("���α׷� ����...");
	}
}
