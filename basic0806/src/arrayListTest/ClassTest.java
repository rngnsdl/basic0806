package arrayListTest;

public class ClassTest {
	

	public static void main(String[] args) {
		Integer a = 7; //Boxing
		int b = new Integer(7); //UnBoxing
		int c = new Integer(10);
		System.out.println("���ΰ�? "+(b==c));
		
		int [] t = {
				new Integer(20),
				new Integer(40),
				5,
				9,13,27,
				new Integer(13)};
		
		System.out.println(a);
		System.out.println(b);
		
		for(Integer i: t) System.out.println("Ŭ���������� ��� "+i);
//		for(Int i: t) System.out.println("�⺻�ڷ��������� ��� "+i);
	}

}
