package quero.pizza.pizzaria.api;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import quero.pizza.common.GenericApi;
import quero.pizza.pizzaria.Pizzaria;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PizzariaApi extends GenericApi<Pizzaria> {
	
	
	@Inject
	private CardapioApi cardapioApi;
	
	@Path("{idPizzaria}/cardapio")
	public CardapioApi getCardapioApi(){
		
		return cardapioApi;
		
	}

	@Override
	protected Class<Pizzaria> getType() {
		return Pizzaria.class;
	}
	
	
}
