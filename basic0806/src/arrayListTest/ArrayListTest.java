package arrayListTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	//Wrapping 클래스
	//Boxing 기본 자료형 -> 클래스 타입으로 자동 변환, unBoxing(클래스 타입을 기본 자료형으로 변환)
	
	public static void main(String[] args) {
		
		Integer a = new Integer(5);
		Integer b = new Integer(7);
		Integer c = new Integer(11);
		List<Integer> list1 = new ArrayList<Integer>();
			// <> 항상 이 template에 들어가는 것은 클래스 타입만 가능하다. 
			//따라서 int같은 기본자료형을 넣을수 없음

		list1.add(new Integer(15));
		list1.add(new Integer(7));
		list1.add(new Integer(71));
		list1.add(new Integer(28));
		list1.add(new Integer(39));
		list1.add(new Integer(51));
		list1.add(new Integer(45)); // 바로 객체를 생성하고 배열에 추가
		list1.add(a);
		list1.add(b);
		list1.add(c); // 이렇게 객체 생성하고 참조변수에 저장후 데이터 입력하던지

		//자바에서는 데이터를 거의 Collection으로 관리한다.
		//Collection의 데이터는 모두가 iterable(순회가능)하므로 advanced for을 사용하게 됨
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		for(Integer i: list1) System.out.println("정렬전의 데이터 "+i);
		System.out.println();//엔터기능
		for(Integer i: list2) System.out.println("정렬전의 데이터 subList "+i);
		System.out.println();//엔터기능
		Collections.sort(list1); //정렬 메서드
		Collections.sort(list2); //정렬 메서드
		for(Integer i: list1) System.out.println("정렬후의 데이터 "+i);
		System.out.println();//엔터기능
		for(Integer i: list2) System.out.println("정렬후의 데이터 subList "+i);
		
		System.out.println("list1.containsAll(list2) :"+ list1.containsAll(list2));
		list1.add(1, 999);//1번 index에 999를 추가함
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.reatainAll): "+list1.retainAll(list2));
		System.out.println("중복만 남긴경우: "+list1+" "+list2);
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i=list2.size()-1; i>=0; i--) { //list2 배열의 크기부터 하나씩 반복
			if(list1.contains(list2.get(i))) //list1에 list2의 데이터가 포함되는지 확인하기 위해
				//list2에서 하나씩 index를 감소시키면서 get메서드로 데이터를 가지고 와서
				//list1에 있는 경우에 list2의 인덱스에 해당하는 list2의 데이터를 삭제한다.
				list2.remove(i);
		}
		System.out.println("중복을 제거하고 난 후: "+list1+ " "+ list2);
	}

}
