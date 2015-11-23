package quero.pizza.vendas.api;

import javax.ejb.Stateless;
import quero.pizza.common.GenericApi;
import quero.pizza.vendas.Pedido;

@Stateless
public class PedidoApi extends GenericApi<Pedido> {

	@Override
	protected Class<Pedido> getType() {
		return Pedido.class;
	}

}
