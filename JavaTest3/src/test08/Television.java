package test08;

public class Television extends Product {
	
		public Television(String category, int price) {
				super(category, price);
		}
		
		@Override
		public void info() {
				System.out.println("��ǰ�з� : "+category);
				System.out.println("��ǰ���� : "+price);
		}

}
