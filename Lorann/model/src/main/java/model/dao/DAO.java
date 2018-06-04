package model.dao;



import java.sql.*;

/**
 * Class used to access the DB
 * @author blenn
 *
 */
public class DAO {
	/**
	 * Reads a map from the "lorann" DB, and returns it as a single String
	 * @param map
	 * @return 
	 * @throws SQLException
	 */
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
