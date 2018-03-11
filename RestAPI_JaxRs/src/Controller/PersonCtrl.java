package Controller;

import DAO.PersonDAO;


public class PersonCtrl {

	
	public static void main(String args[]){
		
		PersonDAO personDAO = new PersonDAO();
		
		personDAO.connect();
		
	}
	
	
}
