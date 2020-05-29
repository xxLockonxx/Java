package p407;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	public Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		public
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	public void method1() {
		//���� ���������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			public
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		//���� ���� ���
			localVar.wake();
			
	}
	
	public void method2(Person person) {
		person.wake();
	}
}
