package model;

public class Element {
	private String sprite;
	private boolean blocking;
	private boolean kills;
	
	public void testouille() {
		System.out.println("ca marche");
	}

	public String getSprite() {
		return sprite;
	}

	public void setSprite(String sprite) {
		this.sprite = sprite;
	}

	public boolean getKills() {
		return kills;
	}

	public void setKills(boolean kills) {
		this.kills = kills;
	}

	public boolean setBlocking() {
		return blocking;
	}

	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}

}
