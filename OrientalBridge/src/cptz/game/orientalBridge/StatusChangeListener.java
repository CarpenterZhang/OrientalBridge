package cptz.game.orientalBridge;

import java.util.EventListener;

public interface StatusChangeListener extends EventListener {
	public void doAction(StatusChangeEvent event);
}
