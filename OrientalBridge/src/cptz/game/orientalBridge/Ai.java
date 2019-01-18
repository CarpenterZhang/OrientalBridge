package cptz.game.orientalBridge;

import java.util.Random;

public class Ai extends Player {

	@Override
	public boolean[] show()  {
		Random rand = new Random();
		boolean[] showArr = new boolean[4];
		if(suit.contains(Card.PIG)) {
			showArr[0] = rand.nextBoolean();
		}
		if(suit.contains(Card.PEACH)) {
			showArr[1] = rand.nextBoolean();
		}
		if(suit.contains(Card.EVIL)) {
			showArr[2] = rand.nextBoolean();
		}
		if(suit.contains(Card.SHEEP)) {
			showArr[3] = rand.nextBoolean();
		}
		return showArr;
	}

}
