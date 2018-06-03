package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import model.Element;

public class Frame extends JFrame implements KeyListener{
	   
		
	private static final long serialVersionUID = 1L;
		private Panel panel;
		private LastOrder last;

        public Frame(Element[][] map){
        	  	
        		this.setFocusable(true);
        		
              	addKeyListener(this);              	
              	
        	  	this.panel = new Panel(map);
        	  	        	  	        	  
                this.setTitle("Lorann G5");

                this.setSize(640, 448);

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                this.setLocationRelativeTo(null);

                this.setResizable(false);
                
                this.setContentPane(panel);
                                                
                this.setLast(LastOrder.IDLE);
                
                this.setVisible(true);
                
                this.toFront();
          }
         /**
          * sets the last movement asked by the player 
          * @param last
          */
        public void setLast(LastOrder last) {
        	  this.last = last;
          }
        /**
         * returns the last movement asked by the player  
         * @return
         */
        public LastOrder getLast() {
        	  return this.last;
          }
        /**
         * returns the frame's Panel  
         * @return
         */
        public Panel getPanel() {
			return this.panel;
        	  
          }
        /**
         * Sets the frame's Panel  
         * @param panel
         */
        public void setPanel(Panel panel) {
        	  this.panel = panel;
          }
        /**
         * Defines the action when a key is pressed
         */
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
		/**
		 * Not used
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * Not used
		 */
		@Override

		public void keyTyped(KeyEvent e) {
		
			
		}
}