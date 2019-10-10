package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import application.record;

public class DB_Access implements DB_Variables{
	
	private Connection con;
	private Statement st;
	
	public DB_Access() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, uname, upass);
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public boolean addData(record R) {
		boolean success = true;
		
		String sql = "select name, phone_number from records";
		try {
			
			ResultSet rs = st.executeQuery(sql);
			rs.moveToInsertRow();
			rs.updateString(1, R.getName());
			rs.updateString(2, R.getNumber());
			rs.insertRow();
		}catch (SQLException e) {
			success = false;
			e.printStackTrace();
		}
		return success; 
	}
	




}