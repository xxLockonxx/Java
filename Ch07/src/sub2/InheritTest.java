package sub2;
/*
 * ��¥ : 2020/05/12
 * �̸� : �̼���
 * ���� : Ŭ���� ��� �ǽ��ϱ� 
 */
public class InheritTest {
	
	public static void main(String[] args) {
		
		SalaryStudent kim = new SalaryStudent("������", 31, "�ΰ��", "�濵��", "SamSung");
		Student lee = new Student("�̼���", 25, "�λ��", "������");
		
	    kim.hello();
		lee.hello();
		
		
	}
}
