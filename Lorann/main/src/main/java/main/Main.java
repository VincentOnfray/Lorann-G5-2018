package main;


import java.io.IOException;
import java.sql.SQLException;

import controller.Controller;




/**
 * <h1>The Class Main.</h1>
 *

 */
public abstract class Main {

    /**
     * @throws SQLException 
     * @throws IOException 
     * 
     */
    public static void main(final String[] args) throws SQLException, IOException {
    	Controller cont= new Controller();
    	cont.start(5);
        

}}
