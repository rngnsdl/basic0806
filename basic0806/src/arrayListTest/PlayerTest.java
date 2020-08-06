package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("ȫ�浿",123));
		players.add(new Player("��浿",234));
		players.add(new Player("�̱浿",456));
		players.add(new Player("��浿",789));
		
		Collections.sort(players);
		System.out.println(players);
		for(Player i : players) {
			System.out.println("�̸���: "+i.getName());
			System.out.println("������: "+i.getScore());
		}
	}

}
