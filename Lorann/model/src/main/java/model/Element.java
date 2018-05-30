package model;

public class Element {
	private String sprite;
	private boolean blocking;
	private boolean deadly;
	
	public Element(String sprite, boolean blocking, boolean deadly) {
		this.setSprite(sprite);
		this.setBlocking(blocking);
		this.setDeadly(deadly);
	}
	public Element() {
		
	}
	public boolean getBlocking() {
		return blocking;
	}
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
	public boolean getDeadly() {
		return deadly;
	}
	public void setDeadly(boolean deadly) {
		this.deadly = deadly;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	
	
	
}

