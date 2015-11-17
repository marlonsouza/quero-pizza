package quero.pizza.produtos.api;

import quero.pizza.common.GenericApi;
import quero.pizza.produtos.Bebida;

public class BebidaApi extends GenericApi<Bebida> {

	@Override
	protected Class<Bebida> getType() {
		return Bebida.class;
	}
	

}
