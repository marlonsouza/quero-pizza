package quero.pizza.produtos.api;

import javax.ejb.Stateless;
import quero.pizza.common.GenericApi;
import quero.pizza.produtos.Pizza;

@Stateless
public class PizzaApi extends GenericApi<Pizza>{

	@Override
	protected Class<Pizza> getType() {
            return Pizza.class;
	}

}
