package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.Person;

public class PersonDAO{
	
	public void addUser(Person p) {
		
		Connection c = connect();
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
