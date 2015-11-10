package quero.pizza.pizzaria.api;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import quero.pizza.common.GenericDAO;
import quero.pizza.pizzaria.Cardapio;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CardapioApi {
	
	@Inject
	private GenericDAO<Cardapio> cardapioDAO;

	@GET
	public Response listaCardapio(@PathParam("idPizzaria") Long id){
		List<Cardapio> cardapios = cardapioDAO.listar(Cardapio.class, "WHERE pizzaria = "+String.valueOf(id));
		
		return Response.ok(cardapios).build();
	}
	
	@GET
	@Path("{id}")
	public Response getCardapio(@PathParam("id") Long id){
		
		return Response.ok(cardapioDAO.buscar(id)).build();
		
	}
	
	@POST
	public Response insert(Cardapio cardapio){
		
		Cardapio toSave = cardapioDAO.save(cardapio);
		
		return Response.status(Status.CREATED).entity(toSave).build();
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Long id){
		
		cardapioDAO.excluir(id, Cardapio.class);
		
		return Response.ok().build();
		
	}
	
}
