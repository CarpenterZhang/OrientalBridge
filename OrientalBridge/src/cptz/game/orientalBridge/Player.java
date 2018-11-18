package cptz.game.orientalBridge;

public class Player {
	private Card[] suit; // 持有牌
	private int level; // 级别
	private Strategy strategy; // 策略
	private Memory memory; // 记忆
	private int sit; // 座次
	private boolean isAi; // 是否是AI

	public Card decision() {
		return null;
	}

	public boolean[] show() {
		return null;
	}

	public void sort() {

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