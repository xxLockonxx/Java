package test09;
/*
 * ��¥ : 2020/05/14
 * �̸� : �̼���
 * ���� : �߻�Ŭ����, ������ ��������
 */
public class JavaTest9 {
	public static void main(String[] args) {
		JavaTest9 here = new JavaTest9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);			
	}
	
	public void draw(Shape obj) {
		obj.draw();
	}

}
