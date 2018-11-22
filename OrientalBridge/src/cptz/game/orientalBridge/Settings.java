package cptz.game.orientalBridge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Settings {
	public static boolean[] AI; // ai设定，按N E S W顺序，是ai，true，否则false
	public static File BG_MUSIC; // 背景音乐
	public static boolean TURN_ON; // 是否开启背景音乐
	public static boolean PLAY_EFFECT; // 出牌音效
	public static int[] LEVEL;

	public static void init() throws FileNotFoundException, IOException {
		AI = new boolean[4];
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("/config/settings.properties")));
		String ai = prop.getProperty("ai");
		String level = prop.getProperty("level");
		for (int i = 0; i < 4; i++) {
			AI[i] = "1".equals(ai.charAt(i)) ? true : false;
			LEVEL[i] = Integer.valueOf(level.charAt(i));
		}
		BG_MUSIC = new File(prop.getProperty("bgMusic"));
		TURN_ON = Boolean.valueOf(prop.getProperty("turnOn"));
		PLAY_EFFECT = Boolean.valueOf(prop.getProperty("playEffect"));
	}

	
}
