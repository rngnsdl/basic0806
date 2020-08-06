package arrayListTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	//Wrapping Ŭ����
	//Boxing �⺻ �ڷ��� -> Ŭ���� Ÿ������ �ڵ� ��ȯ, unBoxing(Ŭ���� Ÿ���� �⺻ �ڷ������� ��ȯ)
	
	public static void main(String[] args) {
		
		Integer a = new Integer(5);
		Integer b = new Integer(7);
		Integer c = new Integer(11);
		List<Integer> list1 = new ArrayList<Integer>();
			// <> �׻� �� template�� ���� ���� Ŭ���� Ÿ�Ը� �����ϴ�. 
			//���� int���� �⺻�ڷ����� ������ ����

		list1.add(new Integer(15));
		list1.add(new Integer(7));
		list1.add(new Integer(71));
		list1.add(new Integer(28));
		list1.add(new Integer(39));
		list1.add(new Integer(51));
		list1.add(new Integer(45)); // �ٷ� ��ü�� �����ϰ� �迭�� �߰�
		list1.add(a);
		list1.add(b);
		list1.add(c); // �̷��� ��ü �����ϰ� ���������� ������ ������ �Է��ϴ���

		//�ڹٿ����� �����͸� ���� Collection���� �����Ѵ�.
		//Collection�� �����ʹ� ��ΰ� iterable(��ȸ����)�ϹǷ� advanced for�� ����ϰ� ��
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		for(Integer i: list1) System.out.println("�������� ������ "+i);
		System.out.println();//���ͱ��
		for(Integer i: list2) System.out.println("�������� ������ subList "+i);
		System.out.println();//���ͱ��
		Collections.sort(list1); //���� �޼���
		Collections.sort(list2); //���� �޼���
		for(Integer i: list1) System.out.println("�������� ������ "+i);
		System.out.println();//���ͱ��
		for(Integer i: list2) System.out.println("�������� ������ subList "+i);
		
		System.out.println("list1.containsAll(list2) :"+ list1.containsAll(list2));
		list1.add(1, 999);//1�� index�� 999�� �߰���
		//list1���� list2�� ��ġ�� �κи� ����� �������� ����
		System.out.println("list1.reatainAll): "+list1.retainAll(list2));
		System.out.println("�ߺ��� ������: "+list1+" "+list2);
		//list2���� list1�� ���Ե� ��ü���� ����
		for(int i=list2.size()-1; i>=0; i--) { //list2 �迭�� ũ����� �ϳ��� �ݺ�
			if(list1.contains(list2.get(i))) //list1�� list2�� �����Ͱ� ���ԵǴ��� Ȯ���ϱ� ����
				//list2���� �ϳ��� index�� ���ҽ�Ű�鼭 get�޼���� �����͸� ������ �ͼ�
				//list1�� �ִ� ��쿡 list2�� �ε����� �ش��ϴ� list2�� �����͸� �����Ѵ�.
				list2.remove(i);
		}
		System.out.println("�ߺ��� �����ϰ� �� ��: "+list1+ " "+ list2);
	}

}
