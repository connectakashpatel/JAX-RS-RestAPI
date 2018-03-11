package Controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import DAO.PersonDAO;
import Model.Person;

@Path("/a")
public class PersonCtrl {
	
	Person p = new Person();
	PersonDAO personDAO = new PersonDAO();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person showuser(@PathParam("id") int id) {
		
		//p = personDAO.showUsers(id);
		
		p.setName("Akash");
		p.setId(id);
		
		return p;
		
	}
	
}
