package model.dao;


import java.io.StringReader;
import java.sql.*;


public class DAO {

	public String readMap(String map) throws SQLException { //cette methode cherche une carte 
		

        String host = "jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String uName = "root";
        String uPass= "";
        String ret = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

        Connection co = DriverManager.getConnection(host,uName,uPass);
        java.sql.Statement state = co.createStatement();
       
      
        ResultSet result = state.executeQuery("CALL pickMap("+map+")");  
        while(result.next()) {
        	ret = result.getString("contenu");
           
        }
        
        return ret;
       
	}
	
}
