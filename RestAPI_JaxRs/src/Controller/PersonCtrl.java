package Controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import DAO.PersonDAO;
import Model.Person;

@Path("/rest")
public class PersonCtrl {
	
	Person p;
	PersonDAO personDAO = new PersonDAO();
	

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response showuser(@PathParam("id") int id) {
		
		JSONObject jobj = new JSONObject();
		p = personDAO.showUsers(id);
		
		try {
			
			jobj.put("id", p.getId());
			jobj.put("name", p.getName());
			
			
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		
		return Response.status(200).entity(jobj).build();
		
	}
	
}
