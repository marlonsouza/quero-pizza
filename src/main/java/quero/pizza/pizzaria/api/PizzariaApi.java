package quero.pizza.pizzaria.api;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import quero.pizza.common.GenericDAO;
import quero.pizza.pizzaria.Pizzaria;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PizzariaApi {
	
	
	@Inject
	private GenericDAO<Pizzaria> pizzariaDAO;
	
	@GET
	public Response listAll(){
		
		List<Pizzaria> pizzarias = pizzariaDAO.listar(Pizzaria.class);
		
		return Response.ok(pizzarias).build();
		
	}
	
	@POST
	public Response insert(Pizzaria pizzaria){
		
		Pizzaria saved = pizzariaDAO.save(pizzaria);
		
		return Response.status(Status.CREATED).entity(saved).build();
		
	}
}
