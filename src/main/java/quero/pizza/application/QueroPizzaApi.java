package quero.pizza.application;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import quero.pizza.pizzaria.api.PizzariaApi;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QueroPizzaApi {

	@Inject
	private PizzariaApi pizzariaApi;
	
	@Path("pizzaria")
	public PizzariaApi getPizzariaApi(){
		return pizzariaApi;
	}
	
}
