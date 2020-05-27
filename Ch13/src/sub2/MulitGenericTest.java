package sub2;
/*
 * ��¥ : 2020/05/20
 * �̸� : ��ö��
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p654
 */
public class MulitGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		System.out.println("tv : "+tv);
		System.out.println("phone : "+phone);
		
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
		
		
		
	}
}
