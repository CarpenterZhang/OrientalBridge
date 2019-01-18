package cptz.game.orientalBridge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Player implements StatusChangeListener, ListenOtherPlayerListener {
	protected List<Card> suit; // 持有牌
	private int level; // 级别
	private Strategy strategy; // 策略
	private Memory memory; // 记忆
	public int sit; // 座次
	private boolean isAi; // 是否是AI
	private List<ListenOtherPlayerListener> loplList;
	
	@Override
	public void doAction(StatusChangeEvent event) {
		Game self = (Game) event.getSource();
		int status = event.getStatus().getStatus();
		if(GameStatus.PLAYING.getStatus() == status) {
			sort();
			show();
		}
	}
	
	@Override
	public void react() {
		
	}


	public static List<Player> init() {
		List<Player> players = new ArrayList<Player>(4);
		boolean[] aiSetting = Settings.AI;
		int[] playerLevel = Settings.LEVEL;
		for (int i = 0; i < 4; i++) {
			Player player = new Player();
			player.setAi(aiSetting[i]);
			player.setLevel(playerLevel[i]);
			player.setSit(i);
			for(int j = 0; j < i; j++) {
				player.addListener(players.get(j));
			}
			players.add(player);
		}
		return players;
	}

	public Player() {
		this.loplList = new ArrayList<ListenOtherPlayerListener>(4);
	}
	
	public void setSuit(List<Card> suit) {
		this.suit = suit;
	}

	public List<Card> getSuit() {
		return suit;
	}

	public Card decision() {
		return null;
	}

	public abstract boolean[] show();

	public void addListener(ListenOtherPlayerListener listener) {
		this.loplList.add(listener);
	}
	
	// 理牌
	public void sort() {
		suit.sort((card1, card2) -> {
			int color = card1.color.getIndex() - card2.color.getIndex();
			return (color != 0) ? color : card1.point - card2.point;
		});
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public int getSit() {
		return sit;
	}

	public void setSit(int sit) {
		this.sit = sit;
	}

	public boolean isAi() {
		return isAi;
	}

	public void setAi(boolean isAi) {
		this.isAi = isAi;
	}

}