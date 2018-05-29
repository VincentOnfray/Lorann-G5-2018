package main;


import controller.Controller;




/**
 * <h1>The Class Main.</h1>
 *

 */
public abstract class Main {

    /**
     * 
     */
    public static void main(final String[] args) {
    	Controller cont= new Controller();
    	cont.start(5);
        

}}
