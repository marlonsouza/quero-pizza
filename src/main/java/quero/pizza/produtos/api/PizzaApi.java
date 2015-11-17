package quero.pizza.produtos.api;

import quero.pizza.common.GenericApi;
import quero.pizza.produtos.Pizza;

public class PizzaApi extends GenericApi<Pizza>{

	@Override
	protected Class<Pizza> getType() {
		return Pizza.class;
	}

}
