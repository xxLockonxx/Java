package sub2;

public class Product<A, B> {

	private A item;
	private B info;
	
	public Product(A item, B info) {
		this.item = item;
		this.info = info;
	}
	
	public void show() {
		System.out.println("��ǰ ���� : "+item);
		System.out.println("��ǰ ���� : "+info);
		
	}
}
