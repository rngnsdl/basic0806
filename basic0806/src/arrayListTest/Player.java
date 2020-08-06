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
		return o.getScore() -this.getScore(); //양수냐 음수냐에 따라 오름차순 내림차순 정렬기준
		// return -this.name.compareTo(o.getName()); //문자열 정렬
	}
}
