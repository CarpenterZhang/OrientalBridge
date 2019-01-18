package cptz.game.orientalBridge;

import java.util.EventObject;

public class PlayerEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	private Card card;

	public PlayerEvent(Card card, Object source) {
		super(source);
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
