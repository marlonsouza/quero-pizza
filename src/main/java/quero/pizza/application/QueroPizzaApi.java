package quero.pizza.application;

import javax.inject.Inject;
import javax.ws.rs.Path;

import quero.pizza.pessoas.api.UsuarioApi;
import quero.pizza.pizzaria.api.PizzariaApi;
import quero.pizza.produtos.api.BebidaApi;
import quero.pizza.produtos.api.PizzaApi;
import quero.pizza.vendas.api.PedidoApi;

@Path("/")
public class QueroPizzaApi {

	@Inject
	private PizzariaApi pizzariaApi;
	
	@Inject
	private UsuarioApi usuarioApi;
	
	@Inject
	private PedidoApi pedidoApi;
	
	@Inject
	private PizzaApi pizzaApi;
	
	@Inject
	private BebidaApi bebidaApi;
	
	@Path("pizzaria")
	public PizzariaApi getPizzariaApi(){
		return pizzariaApi;
	}
	
	@Path("usuario")
	public UsuarioApi getUsuarioApi(){
		return usuarioApi;
	}
	
	@Path("pedido")
	public PedidoApi getPedidoApi(){
		return pedidoApi;
	}
	
	@Path("pizza")
	public PizzaApi getPizzaApi(){
		return pizzaApi;
	}
	
	@Path("bebida")
	public BebidaApi getBebidaApi(){
		return bebidaApi;
	}
	
}
