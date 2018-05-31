package view;

import javax.swing.JFrame;


public class Frame extends JFrame {


	private static final long serialVersionUID = 1L;
private static Panel[][] uIMap;
	
  public Frame(){                
	 this.uIMap = new Panel[20][13];
	
		
	for(int Y = 0 ; Y<13 ; Y++) {
		
		for(int X = 0 ; X<20 ; X++) {
			uIMap[X][Y] = new Panel(X,Y);
			
			this.add(uIMap[X][Y]);
		
		}
	}
	  
    this.setTitle("Lorann G5 TM");

    this.setSize(646, 413);

    this.setLocationRelativeTo(null);               

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setResizable(false);
    
    this.setVisible(true);
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
  //Méthods
  
  public static void afficher(int x, int y, String sprite) {

	  	uIMap[x][y].sprite = sprite;
	    /*panel.setX(x*32);
	    panel.setY(y*32);
	 
	    panel.sprite = lien; 
	    panel.repaint();*/
	    }   
}