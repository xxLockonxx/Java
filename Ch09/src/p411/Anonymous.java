package p411;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	public RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
		
	};
	
	public void method1() {
	 //���� ���������� ����
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
			
		};
		
		//���� ���� ���
		localVar.turnOn();
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
