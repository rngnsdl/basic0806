package arrayListTest;

public class Player implements Comparable<Player> {
	private String name;
	private int score;
	public Player(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Player o) {
		return o.getScore() -this.getScore(); //����� �����Ŀ� ���� �������� �������� ���ı���
		// return -this.name.compareTo(o.getName()); //���ڿ� ����
	}
}
