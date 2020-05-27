package sub2;
/* 
 * ��¥ : 2020/05/18
 * �̸� : �̼���
 * ���� : String Ŭ���� �ǽ��ϱ� ���� p496
 *
 * String Ŭ����
 *  - ���ڿ��� �����ϴ� ������ Ÿ��
 *  - ���ڿ� ������ �迭�� ���� ������ ���´�.
 *  - ���ڿ� �񱳴� equals �޼��带 ȣ���Ѵ�.
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		
		// ���ڿ� = ���� + �迭 
		String str = "Hello";
		char[] arr = {'H','e','l','l', 'o'};
		
		// ���ڿ� ��ü����
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello"; //literal ����
		String str4 = "Hello"; //literal ����
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		if(str == str4) {
			System.out.println("str�� str4�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str�� str4�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		//���ڿ� ��
		if(str1.equals(str3)) {
			System.out.println("str1�� str3�� ���ڿ����� ����.");
		}else {
			System.out.println("str1�� str3�� ���ڿ����� �ٸ���.");
		}
		
		
		
	}
}
