package quero.pizza.produtos.api;

import javax.ejb.Stateless;
import quero.pizza.common.GenericApi;
import quero.pizza.produtos.Bebida;

@Stateless
public class BebidaApi extends GenericApi<Bebida> {

	@Override
	protected Class<Bebida> getType() {
		return Bebida.class;
	}
	

}
