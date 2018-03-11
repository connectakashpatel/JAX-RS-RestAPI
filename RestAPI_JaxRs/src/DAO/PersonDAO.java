package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Person;

public class PersonDAO{
	
	Person p = new Person();
	
	public Person showUsers(int id) {
		
		Connection c = connect();
		String sql = "SELECT * FROM person WHERE id=?";
		PreparedStatement ps;
		ResultSet rs;
		
		try {
			
			ps = c.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				p.setId(rs.getInt(0));
				p.setName(rs.getString("name"));
				
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return p;
		
	}


	public Connection connect() {
		
		Connection connect = null;
		
		String user = "root";
		String pass = "root";
		String url = "jdbc:mysql://localhost:3306/akash";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(user, pass, url);
			
			System.out.println("Connected");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return connect;
	}

}
