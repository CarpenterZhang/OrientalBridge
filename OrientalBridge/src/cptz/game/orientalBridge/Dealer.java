package cptz.game.orientalBridge;

import java.util.Collections;
import java.util.List;

public class Dealer implements StatusChangeListener {
	// 发牌
	public static void deal(List<Player> players, List<Card> cards) {
		for (int i = 0; i < 4; i++) {
			players.get(i).setSuit(cards.subList(i * 13, (i + 1) * 13));
		}
	}

	@Override
	public void doAction(StatusChangeEvent event) {
		Game self = (Game) event.getSource();
		if(GameStatus.READY.equals(event.getStatus())) {
			List<Card> poker = self.getPoker();
			List<Player> players = self.getPlayers();
			shuffle(poker);	// 洗牌
			deal(players, poker); // 发牌
			for(Player player : players) {
				self.addListener(player);
			}
			
			self.setStatus(GameStatus.PLAYING);
		}
	}
	
	// 洗牌
	public static void shuffle(List<Card> cards) {
		Collections.shuffle(cards);
	}

	public static void computeRound() { // 计算当前轮得分

	}

	public static void computeRoll(Record rec) { // 计算当前圈得分

	}

}
