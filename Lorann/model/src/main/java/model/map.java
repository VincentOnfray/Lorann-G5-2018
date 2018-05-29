package model;

import java.util.ArrayList;

public class Map {
	private Element[][] grid;
	private ArrayList demonList;
	public Map() {
		this.grid = new Element[20][13];
		this.demonList = new ArrayList();
	}
	
	
	public void setCell(int X, int Y, Element element) {
		this.grid[X][Y] = element;
	}
	
	public Element getCell(int X, int Y) {
		return this.grid[X][Y];
	}
	
	public Element[][] getGrid(){
		return this.grid;
	}
	
	public java.lang.Object getDemon(int n) {
		return demonList.get(n);
	}
}
