package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * ��¥ : 2020/05/20
 * �̸� : �̼���
 * ���� : TreeSet �ǽ��ϱ� ���� p752
 */
public class TreeSetTest {
	public static void main(String[] args) {
		
		// Treeset ���� �� ���� ������ ����
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		for(int num : tree ) {
			System.out.println(num+", ");
		}
		
		
	}
}
