package model;

public class Element {
	private String sprite;
	private boolean blocking;
	private boolean deadly;
	
	public Element(String sprite, boolean blocking, boolean deadly) {
		this.sprite = sprite;
		this.blocking = blocking;
		this.deadly = deadly;
	}
	public Element() {
		
	}
}

