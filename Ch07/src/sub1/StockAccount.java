package sub1;

public class StockAccount extends Account {
	
	private String stock;
	private int amount;
	private int price;
	
	StockAccount(String bank,
				 String id,
				 String name,
				 int money,
				 String stock,
				 int amount, 
				 int price) {
		super(bank, id, name, money);// �θ�Ŭ���� ������ ȣ��
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}

	public void sell(int amount) {
		this.amount -= amount;
		this.money += amount*price;
	}
	
	public void buy(int amount) {
		this.amount += amount;
		this.money -= amount*price;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("�� �� ��  : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�� �� ��  : "+name);
		System.out.println("�����ܾ� : "+money);
		System.out.println("�ֽ����� : "+stock);
		System.out.println("�ֽļ��� : "+amount);
		System.out.println("�ֽİ��� : "+price);
	}
	
}	
