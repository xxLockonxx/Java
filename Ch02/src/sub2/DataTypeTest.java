package sub2;
/*
 * ��¥: 2020/04/29
 * �̸�: �̼���
 * ����: ������ �ڷ���(������ Ÿ��) �ǽ��ϱ�
 */
public class DataTypeTest {

	public static void main(String[] args) {
		
		// ������
		byte  var1 = 127; // �ƽø� 127���� ���� 128 ���� �Ұ� 1byte = 8bit 2�� 0�� ���� 2�� 6�±��� ���ϸ� 127
		short var2 = 2; // 
		int   var3 = 2147483647; //������� ���尡��
		long  var4 = 4;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		// �Ǽ���
		float  var5 = 1.123456789f; // ���� f �� �ٿ���� �� ������. �Ҽ����ڷ� 7�ڸ����� �ۿ� �ȳ��ͼ� 
		double var6 = 1.23456789123456789; // �ΰ��� ũ������ 16�ڸ����� ����.
		
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		
		// ����
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		
		// ������
		char ch1 = 'A'; //�ܾ� �ȵ�. //����ǥ �Ѱ�
		char ch2 = '��'; 
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		// ���ڿ�(�ܾ�)
		String str1 = "Apple";
		String str2 = "Hello";
		String str3 = "�ȳ�";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
		
		
	}
	
}
