package p412;

import p411.Anonymous;
import p411.RemoteControl;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("SmartTV�� �մϴ�.");
					}

					@Override
					public void turnOff() {
						System.out.println("SmartTVfmf ���ϴ�.");
					}
					
				}
				
				
				);
		
		
	}
}
