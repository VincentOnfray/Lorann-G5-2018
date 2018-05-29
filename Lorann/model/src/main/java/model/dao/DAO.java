package model.dao;


import java.io.StringReader;
import java.sql.*;


public class DAO {

	public String readMap(int map) throws SQLException {
		

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
       
        ResultSet result = state.executeQuery("SELECT contenu FROM niveau WHERE ID_Niveau= "+map);
        
        while(result.next()) {
        	ret = result.getString("contenu");
           
        }
        
        return ret;
       
	}
	
}
