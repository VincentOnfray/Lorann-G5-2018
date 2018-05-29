package controller;

import model.Element;
import view.Frame;


public class Controller implements IController{

	@Override
	public void start(int i) {
		// TODO Auto-generated method stub
		System.out.println("lol");
		Element el = new Element();
		el.testouille();
		Frame fr = new Frame();
		fr.frameTest();
	}

	@Override
	public int chooseMap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	
	
}
