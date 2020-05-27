package sub3;
/* 
 * ��¥ : 2020/05/18
 * �̸� : �̼���
 * ���� : AutoBoxing, AutoUnBoxing �ǽ��ϱ� ���� p527
 */
public class AutoBoxingTest {
	public static void main(String[] args) {
		
		// Auto-Boxing
		Integer var1 = 1;
		Double  var2 = 2.13;
		Boolean var3 = true;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		
		// Auto-Unboxing
		int 	value1 = var1;
		double 	value2 = var2;
		boolean value3 = var3;
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
		
	}
}
