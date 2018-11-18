package cptz.game.orientalBridge;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private List<Player> players; // 选手 N W S E
	private Dealer dealer; // 荷官
	private List<Card> card; // 牌
	private Record record; // 记录本
	private Rule rule; // 规则
	private Table table; // 牌桌，用于显示
	private Settings settings; // 全局设置
	// private Timer timer; // 计时器

	public int main() {
		new Game().start().stop();
		return 0;
	}

	public Game() {
		players = new ArrayList<Player>(4);
		dealer = new Dealer();
		card = new ArrayList<Card>(52);
		record = new Record();
		rule = new Rule();
		table = new Table();
		settings = new Settings();
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

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
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

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
