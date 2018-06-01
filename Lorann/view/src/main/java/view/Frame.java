package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import model.Element;

public class Frame extends JFrame implements KeyListener{
	   
		private Panel panel;
		private LastOrder last;

        public Frame(Element[][] map){
        	  	setFocusable(true);
        	  
              	addKeyListener(this);              	
              	
        	  	this.panel = new Panel(map);
        	  	
        	  	this.toFront();
        	  
                this.setTitle("Lorann G5");

                this.setSize(640, 416);

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                this.setLocationRelativeTo(null);

                this.setResizable(false);

                this.setVisible(true);
                
                this.setContentPane(panel);
                
                
                this.setLast(LastOrder.IDLE);
          }
          
          public void setLast(LastOrder last) {
        	  this.last = last;
          }
          
          public LastOrder getLast() {
        	  return this.last;
          }
          
          public Panel getPanel() {
			return this.panel;
        	  
          }
          public void setPanel(Panel panel) {
        	  this.panel = panel;
          }

		@Override
		public void keyPressed(KeyEvent evt) {
										
		if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
          this.setLast(LastOrder.RIGHT);
			
        }
        if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
        	this.setLast(LastOrder.LEFT);
        }

        if(evt.getKeyCode() == KeyEvent.VK_UP) {
        	this.setLast(LastOrder.UP);
        }

        if(evt.getKeyCode() == KeyEvent.VK_DOWN) {
        	this.setLast(LastOrder.DOWN);
        }
       }
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override

			public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}