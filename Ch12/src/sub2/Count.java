package sub2;

import java.util.Set;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	// ����ȭ ��ϼ������� �����尣 ������ ���´�.
	public synchronized void setNum() {
		
		num++;
	
	}
	
}
