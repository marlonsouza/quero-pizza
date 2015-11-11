package quero.pizza.application;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import quero.pizza.pessoas.api.UsuarioApi;
import quero.pizza.pizzaria.api.PizzariaApi;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QueroPizzaApi {

	@Inject
	private PizzariaApi pizzariaApi;
	
	@Inject
	private UsuarioApi usuarioApi;
	
	@Path("pizzaria")
	public PizzariaApi getPizzariaApi(){
		return pizzariaApi;
	}
	
	@Path("usuario")
	public UsuarioApi getUsuarioApi(){
		return usuarioApi;
	}
	
}
