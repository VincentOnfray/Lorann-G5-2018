package model;



public class Map {
	private Element[][] grid;
	private Demon[] demonList;
	private Player lorann;
	private int nDemon;
	
	
	
	
	public Map() {
		this.grid = new Element[20][13];
		this.demonList = new Demon[4];
		this.nDemon = 0;
	}
	
	/**
	 * Places an Element in the designated cell of the grid
	 * @param X
	 * @param Y
	 * @param element
	 */
	public void setCell(int X, int Y, Element element) {
		this.grid[X][Y] = element;
	}
	
	/**
	 * returns the Element from the designated grid Cell
	 * @param X
	 * @param Y
	 * @return
	 */
	public Element getCell(int X, int Y) {
		return this.grid[X][Y];
	}	
	
	
	/**
	 * returns the entire grid
	 * @return
	 */
	public Element[][] getGrid(){
		return this.grid;
	}
	
	/**
	 * returns a demon from the specified Demonlist cell
	 * @param n
	 * @return
	 */
	public Demon getDemon(int n) {
		return demonList[n];
		
	}
	
	/**
	 * binds a Player Element to the map
	 * @param lorann
	 */
	public void setLorann(Player lorann) {
		this.lorann= lorann;
	}
	
	/**
	 * returns the map's Lorann
	 * @return
	 */
	public Player getLorann() {
		return this.lorann;
	}
	
	/**
	 * returns the entire deomonList
	 * @return
	 */
	public Demon[] getDemonList() {
		return this.demonList;
	}
	
	/**
	 * returns the number of demons present on the map
	 * @return
	 */
    public int getnDemon() {
    	return this.nDemon;
    }
    
    /**
     * sets the number of demons on the map
     * @param nb
     */
    public void setnDemon(int nb) {
    	this.nDemon = nb;
    }
    
    /**
     * adds a demon to the specified demonList cell
     * @param i
     * @param demon
     */
    public void setDemon(int i, Demon demon) {
    	this.demonList[i] = demon;
    }

}

