package cptz.game.orientalBridge;

import java.util.EventObject;

public class StatusChangeEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	private GameStatus status;

	public StatusChangeEvent(GameStatus status, Object obj) {
		super(obj);
		this.status = status;
	}

	public GameStatus getStatus() {
		return status;
	}

	public void setStatus(GameStatus status) {
		this.status = status;
	}

}
