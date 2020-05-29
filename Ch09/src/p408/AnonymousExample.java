package p408;

import p407.Anonymous;
import p407.Person;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				
				}
			@Override
			public
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
			
		}
			
		);
	}
}
