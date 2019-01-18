package cptz.game.orientalBridge;

public enum Color {
	SPADE(1, "S"),
	HEART(2, "H"),
	CLUB(3, "C"),
	DIAMOND(4, "D");

	Color(int index, String face) {
		this.index = index;
		this.face = face;
	}

	public String getFaceByIndex(int index) {
		for (Color c : Color.values()) {
			if (index == c.getIndex())
				return c.getFace();
		}
		return null;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	private int index;
	private String face;
}
