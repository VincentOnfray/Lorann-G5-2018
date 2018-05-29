package main;

import java.sql.SQLException;

import controller.Controller;

public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws SQLException 
     */
    public static void main(final String[] args) throws SQLException {
       Controller controller =  new Controller();
       controller.start();
       
    }

}
