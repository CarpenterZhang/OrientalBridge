package cptz.game.orientalBridge;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game implements StatusChangeListener {
	private Dealer dealer; // 荷官
	private Rule rule; // 规则
	private List<Card> poker; // 牌
	private List<Player> players; // 选手 N W S E
	private Record record; // 记录本
//	private Table table; // 牌桌，用于显示
//	private Settings settings; // 全局设置
	// private Timer timer; // 计时器
	private GameStatus status;

	List<StatusChangeListener> listenerList;

	public Game addListener(StatusChangeListener listener) {
		listenerList.add(listener);
		return this;
	}

	@Override
	public void doAction(StatusChangeEvent event) {
		if (event.getStatus().equals(GameStatus.PREPARE)) {
			dealer = new Dealer();
			rule = new Rule();
			poker = Card.init();
			players = Player.init();
			record = new Record();

			addListener(this.dealer);
			setStatus(GameStatus.READY);
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		new Game();
	}

	public Game() throws FileNotFoundException, IOException {
		this.listenerList = new ArrayList<StatusChangeListener>();
		addListener(this);

		setStatus(GameStatus.PREPARE);
	}

	public void setStatus(GameStatus status) {
		this.status = status;
		StatusChangeEvent e = new StatusChangeEvent(status, this);
		for (StatusChangeListener listener : listenerList) {
			listener.doAction(e);
		}
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

	public List<Card> getPoker() {
		return poker;
	}

	public List<Player> getPlayers() {
		return players;
	}

}
