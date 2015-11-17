package quero.pizza.vendas.api;

import quero.pizza.common.GenericApi;
import quero.pizza.vendas.Pedido;

public class PedidoApi extends GenericApi<Pedido> {

	@Override
	protected Class<Pedido> getType() {
		return Pedido.class;
	}

}
