package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("홍길동",123));
		players.add(new Player("김길동",234));
		players.add(new Player("이길동",456));
		players.add(new Player("고길동",789));
		
		Collections.sort(players);
		System.out.println(players);
		for(Player i : players) {
			System.out.println("이름은: "+i.getName());
			System.out.println("점수는: "+i.getScore());
		}
	}

}
