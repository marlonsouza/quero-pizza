package quero.pizza.vendas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import quero.pizza.produtos.Item;

@Entity
@Table(name="pedidos")
public class Pedido {

	private List<Item> itens;
	
	private StatusPedido status;
	
	private Double valorTotal;
	
}
