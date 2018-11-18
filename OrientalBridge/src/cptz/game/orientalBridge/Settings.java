package cptz.game.orientalBridge;

import java.io.File;

public class Settings {
	private File bgMusic; // 背景音乐
	private boolean turnOn; // 是否开启背景音乐
	private boolean playEffect; // 出牌音效

	public File getBgMusic() {
		return bgMusic;
	}

	public void setBgMusic(File bgMusic) {
		this.bgMusic = bgMusic;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	public boolean isPlayEffect() {
		return playEffect;
	}

	public void setPlayEffect(boolean playEffect) {
		this.playEffect = playEffect;
	}
}
