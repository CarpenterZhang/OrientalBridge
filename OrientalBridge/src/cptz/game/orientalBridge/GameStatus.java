package cptz.game.orientalBridge;

public enum GameStatus {
	PREPARE(1, "prepare"), 
	READY(2, "ready"), 
	SHOWN(4, "has shown"), 
	PLAYING(8, "playing"), 
	FINISH(16, "game over")

	;

	GameStatus(int status, String name) {
		this.status = status;
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int status;
	private String name;
}
