package quero.pizza.pizzaria.api;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import quero.pizza.common.GenericApi;
import quero.pizza.common.GenericDAO;
import quero.pizza.pizzaria.Cardapio;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CardapioApi extends GenericApi<Cardapio> {
	
	@Inject
	private GenericDAO<Cardapio> cardapioDAO;

	@GET
	public Response list(@PathParam("idPizzaria") Long id){
		List<Cardapio> cardapios = cardapioDAO.listar(Cardapio.class, "WHERE pizzaria = "+String.valueOf(id));
		
		return Response.ok(cardapios).build();
	}
	
	@Override
	protected Class<Cardapio> getType() {
		return Cardapio.class;
	}
	
}
