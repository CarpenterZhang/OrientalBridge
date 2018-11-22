package cptz.game.orientalBridge;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Game {
	private List<Player> players; // 选手 N W S E
//	private Dealer dealer; // 荷官
	private List<Card> poker; // 牌
	private Record record; // 记录本
	private Rule rule; // 规则
//	private Table table; // 牌桌，用于显示
//	private Settings settings; // 全局设置
	// private Timer timer; // 计时器

	public static void main(String[] args) throws FileNotFoundException, IOException {
		new Game().start().stop();
	}

	public Game() throws FileNotFoundException, IOException {
		rule = new Rule();
		poker = Card.init();
		players = Player.init();
		record = new Record();
	}

	// 开始游戏
	public Game start() {
		
		
		return this;
	}

	// 结束游戏
	public Game stop() {
		return this;
	}

	// 暂停
	public Game pause() {
		return this;
	}

	// 恢复
	public Game resume() {
		return this;
	}

	// 退出
	public void quit() {

	}

	// 保存游戏
	public Game save() {
		return this;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

}
