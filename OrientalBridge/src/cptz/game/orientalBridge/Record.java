package cptz.game.orientalBridge;

import java.util.ArrayList;
import java.util.List;

public class Record implements StatusChangeListener {
	private static List<List<List<Card>>> HISTORY; // [圈 52张][轮 4张][张]
	public static int GAME_COUNT; // 当前游戏局数
	public static List<List<Card>> GOTTEN_CARDS; // 当前圈截止到上一轮，每个选手吃的牌
	public static int[] SCORE_SUM; // 截止到上一圈，每个选手累计得分
	public static int[] SHOW; // 明牌/卖牌情况
	public static Color CUR_COLOR; // 当前轮主花色
	public static int CUR_PLAYER; // 当前轮到哪个选手出牌

	public Record() {
		List<List<Card>> roll = new ArrayList<List<Card>>(13);
		HISTORY = new ArrayList<List<List<Card>>>();
		roll.add(new ArrayList<Card>(4));
		HISTORY.add(roll);

		GAME_COUNT = 1;

		GOTTEN_CARDS = new ArrayList<List<Card>>(4);
		GOTTEN_CARDS.add(new ArrayList<Card>());

		SCORE_SUM = new int[4];
		SHOW = new int[4];

		CUR_COLOR = Rule.FIRST_CARD.color;
	}

	@Override
	public void doAction(StatusChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	public int getFirstAttacker() {
		return 0; // 确定上一圈得猪选手下标，如果是第一圈，返回-1

	}

	public boolean addRound(Card[] round) {
		return false; // 将当前轮记录进history

	}

}