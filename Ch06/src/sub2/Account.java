package sub2;

public class Account {
	// Ư��(�������)
	// - ���ٱ��� private �������� ������ ĸ��ȭ �Ѵ�.
	private String bank;
	private String id;
	private String name;
	private int money;
	
	//������ (���� �ܺο��� �ʱ�ȭ�ϴ� �����Ͱ� ���͵� �ȴ�.)
	// : ��ü�� ���� �� �� ��������� �ʱ�ȭ�ϴ� �޼���
	Account(String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���(�޼���)
	public void deposit(int money) {
		this.money += money; //�����ϰ� ���ڸ� �׳� �̸��� �ٸ��� �����ؼ� �ص� �ȴ�. this�� AccountŬ������ ��Ī�Ѵ�. �ű⿡ �ִ� money���� ����
		
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("�� �� �� : "+bank); //������� �̸��� �ߺ����� ������ ���� this�� ���ʿ䰡 ����.
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�� �� �� : "+name);
		System.out.println("�����ܾ� : "+money);
	}
}
