package quero.pizza.pizzaria;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import quero.pizza.produtos.Item;

@Entity
@Table(name="cardapios")
public class Cardapio {

	private Pizzaria pizzaria;
	
	private List<Item> itens;
	
}
