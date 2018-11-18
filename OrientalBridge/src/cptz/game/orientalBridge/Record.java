package cptz.game.orientalBridge;

public class Record {
	private int gameCount; // 当前游戏局数
	private static Card[][][] history; // [局 1头猪][圈 52张][轮 4张][张]
	private Card[][] gottenCards; // 当前圈截止到上一轮，每个选手吃的牌
	private int[] scoreSum; // 截止到上一圈，每个选手累计得分
	private int[] show; // 明牌/卖牌情况
	private Color curColor; // 当前轮主花色
	private int curPlayer; // 当前轮到哪个选手出牌

	public int getFirstAttacker() {
		return 0; // 确定上一圈得猪选手下标，如果是第一圈，返回-1

	}

	public boolean addRound(Card[] round) {
		return false; // 将当前轮记录进history

	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}

	public int[] getScoreSum() {
		return scoreSum;
	}

	public void setScoreSum(int[] scoreSum) {
		this.scoreSum = scoreSum;
	}

	public Color getCurColor() {
		return curColor;
	}

	public void setCurColor(Color curColor) {
		this.curColor = curColor;
	}

	public int getCurPlayer() {
		return curPlayer;
	}

	public void setCurPlayer(int curPlayer) {
		this.curPlayer = curPlayer;
	}
}