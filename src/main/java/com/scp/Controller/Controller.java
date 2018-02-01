package com.scp.Controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import com.scp.Services.Employee;
import com.scp.Services.ClientDemo;
import com.scp.dao.UserDaoImpl;
import com.scp.webService.Model.User;

@Path("/user")
public class Controller {

	//checking
	@GET
	@Path("/getMessage")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg() {
		System.out.println("1 numer");
		return "Bhava work hutay ki...!!";
	}

	//checking
	@GET
	@Path("/getEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee() {
		return new Employee(101, 200000);
	}

	@GET
	@Path("/getList")
	@Produces(MediaType.APPLICATION_JSON)
	public List getList() throws ClientProtocolException, JSONException, IOException {
		return ClientDemo.getALLCountries();
	}

	@GET
	@Path("/getData/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List getData(@PathParam("id") int id) throws ClientProtocolException, JSONException, IOException {
		System.out.println(id);
		return null;
	}

	//from DB
	@GET
	@Path("/ListFromDB")
	@Produces(MediaType.APPLICATION_JSON)
	public List getListfromDB() throws ClientProtocolException, JSONException, IOException {
		return new UserDaoImpl().getAll();
	}

	//from DB
	@GET
	@Path("/getByIDFromDB/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getById(@PathParam("id") int id) throws ClientProtocolException, JSONException, IOException {
		return new UserDaoImpl().getUserById(id);
	}

	//from DB
	@POST
	@Path("/insertIntoDB")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean insertIntoDb(User user) throws ClientProtocolException, JSONException, IOException {
		return new UserDaoImpl().addUser(user);
	}

	//from DB
	@DELETE
	@Path("/deleteByIDFromDB/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean deleteById(@PathParam("id") int id) throws ClientProtocolException, JSONException, IOException {
		return new UserDaoImpl().deleteById(id);
	}
}