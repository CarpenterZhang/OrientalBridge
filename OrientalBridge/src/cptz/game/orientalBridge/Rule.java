package cptz.game.orientalBridge;

public class Rule {

	private Card firstCard; // 第一圈第一轮第一张
	private boolean canShow; // 是否允许明牌/卖牌
	private boolean canSurvive; // 是否允许对于明牌/卖牌首轮逃头子 true: 首轮可以出, false: 首轮不可以出
	private boolean isTeam; // 是否打对家
	private boolean forceShow; // 是否强制明牌/卖牌
	// private boolean posOnlyOne; // 负同归于尽或是你死我活
	// private boolean negOnlyOne; // 正同归于尽或是你死我活

	public Card getFirstCard() {
		return null;
		// 默认梅花2
	}

	public boolean getCanShow() {
		return false;

	}

	public boolean isLegal(Color curColor, Card curCard, Card[] remainSuit) {
		return false; // 验证是否合法
	}
}
