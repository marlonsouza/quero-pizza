package quero.pizza.pizzaria;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import quero.pizza.produtos.Pizza;

@Entity
@Table(name="cardapios")
public class Cardapio {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_cardapio")
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="i_pizzaria")
	private Pizzaria pizzaria;
	

	@OneToMany
	@JoinTable(name="pizzas_cardapios",
		joinColumns=@JoinColumn(name="cardapio_pizza"),
		inverseJoinColumns=@JoinColumn(name="pizza_cardapio"))
	private List<Pizza> pizzas;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Pizzaria getPizzaria() {
		return pizzaria;
	}


	public void setPizzaria(Pizzaria pizzaria) {
		this.pizzaria = pizzaria;
	}


	public List<Pizza> getItens() {
		return pizzas;
	}


	public void setItens(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
}
