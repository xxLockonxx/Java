package sub2;
/* 
 * ��¥ : 2020/05/18
 * �̸� : �̼���
 * ���� : String ��� �ǽ��ϱ� ���� p496
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		// length - ���ڿ��� ����(���ڰ���)��ĭ�� ���ڷ� ����Ѵ�.
		System.out.println("str ���ڿ� ���� : "+str.length());
		
		// charAt - ���ڿ����� Ư������ ����
		System.out.println("str�� 6��° ���� : "+str.charAt(6));
		
		// substring - ���ڿ� �ڸ���
		System.out.println("str�� 0������ 5������ ���ڿ� : "+str.substring(0, 5));
		System.out.println("str�� 6������ ���������� ���ڿ� : "+str.substring(6));
		
		// indexOf, lastIndexOf - ���ڿ����� ���� �ε�����ȣ ����
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("���ڿ� str���� �տ��� ����  ���� e�� �ε����� : "+idx1);
		System.out.println("���ڿ� str���� �ڿ��� ���� ���� e�� �ε����� : "+idx2);
		
		// replace
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newStr);
		
		// valueOf
		int		 var1 = 1;
		double   var2 = 2.13;
		boolean  var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
		
	}
}
