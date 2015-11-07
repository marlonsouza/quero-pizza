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

import quero.pizza.produtos.Item;

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
	@JoinTable(name="itens_cardapios",
		joinColumns=@JoinColumn(name="cardapio_item"),
		inverseJoinColumns=@JoinColumn(name="item_cardapio"))
	private List<Item> itens;


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


	public List<Item> getItens() {
		return itens;
	}


	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
}
