package test04;

import java.util.Scanner;

/*
 * ��¥ : 2020/05/22
 * �̸� : �̼���
 * ���� : ���ڿ� ��������
 */
public class JavaTest4 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String[] names = {"������", "������", "�庸��", "������", "�̼���", "�����"};
			
			System.out.println("�̸� �˻� : ");
			String name = sc.next();
			
			int i = 0;
			while(!name.equals(names[i])){
				i++;
			}
			
			System.out.println(name + "�� �迭�� "+i+"���� �ֽ��ϴ�.");
		}
}
