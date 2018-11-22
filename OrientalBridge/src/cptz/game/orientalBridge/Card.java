package cptz.game.orientalBridge;

import java.util.ArrayList;
import java.util.List;

public class Card {
	public Color color; // 花色
	public int point; // 点数
	public String face; // 显示字符
	public int score; // 分数
	
	public Card(Color color, int point, String face, int score) {
		super();
		this.color = color;
		this.point = point;
		this.face = face;
		this.score = score;
	}

	public static List<Card> init() {
		List<Card> poker = new ArrayList<Card>(52);
		for(int i = 2; i <= 14; i++) {
			String face;
			if(i == 11) face = "J";
			else if(i == 12) face = "Q";
			else if(i == 13) face = "K";
			else if(i == 14) face = "A";
			else face = String.valueOf(i);

			poker.add(new Card(Color.SPADE, i, face, 0));
			poker.add(new Card(Color.HEART, i, face, 0));
			poker.add(new Card(Color.CLUB, i, face, 0));
			poker.add(new Card(Color.DIAMOND, i, face, 0));
		}
		return poker;
	}
}
