package cptz.game.orientalBridge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Rule {

	public static Card FIRST_CARD; // 第一圈第一轮第一张
	public static boolean CAN_SHOW; // 是否允许明牌/卖牌
	public static boolean CAN_SURVIVE; // 是否允许对于明牌/卖牌首轮逃头子 true: 首轮可以出, false:
										// 首轮不可以出
	public static boolean IS_TEAM; // 是否打对家
	public static boolean FORCE_SHOW; // 是否强制明牌/卖牌
	// private boolean posOnlyOne; // 负同归于尽或是你死我活
	// private boolean negOnlyOne; // 正同归于尽或是你死我活

	public static void init() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("/config/settings.properties")));
		String firstCard = prop.getProperty("firstCard");
		char firstCardColor = firstCard.charAt(0);
		Color c = (firstCardColor == 'S') ? Color.SPADE : (firstCardColor == 'H') ? Color.HEART : (firstCardColor == 'C') ? Color.CLUB : Color.DIAMOND;
		String firstCardFace = firstCard.substring(1);
		@SuppressWarnings("serial")
		Map<String, Integer> faceMap = new HashMap<String, Integer>() {
			{
				put("J", 11);
				put("Q", 12);
				put("K", 13);
				put("A", 14);
			}
		};
		int firstCardPoint;
		if(faceMap.containsKey(firstCardFace)) {
			firstCardPoint = faceMap.get(firstCardFace);
		} else {
			firstCardPoint = Integer.valueOf(firstCardFace);
		}
		FIRST_CARD = new Card(c, firstCardPoint, firstCardFace, 0);
		CAN_SHOW = Boolean.valueOf(prop.getProperty("canShow"));
		CAN_SURVIVE = Boolean.valueOf(prop.getProperty("canSurvive"));
		IS_TEAM = Boolean.valueOf(prop.getProperty("isTeam"));
		FORCE_SHOW = Boolean.valueOf(prop.getProperty("forceShow"));
	}

	public static boolean isLegal(Color curColor, Card curCard, Card[] remainSuit) {
		return false; // 验证是否合法
	}
}
