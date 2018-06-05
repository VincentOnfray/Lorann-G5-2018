package model.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import java.sql.*;
public class DAOTest {

	@Test
	public void test() throws SQLException {
		DAO dao = new DAO();
		
		assertNotNull("La DAO retourne bien des infos", dao.readMap("7"));		
		
	}

}
