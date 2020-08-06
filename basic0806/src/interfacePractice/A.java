package interfacePractice;

class A {
	
	public void methodA(I i) {
		i.methodB();
	}
	
	@Override
	public String toString() {
		return "여기는 I를 구현한 A 클래스";
	}
}
