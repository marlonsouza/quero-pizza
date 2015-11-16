package quero.pizza.produtos;

import static com.google.common.base.Preconditions.checkNotNull;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="itens")
@Inheritance(strategy=InheritanceType.JOINED)
public class Item {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="i_item")
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="preco")
	private BigDecimal preco;

	public Long getId() {
		return id;
	}
	
	protected Item(){}

	private Item(Long id, String descricao, BigDecimal preco){
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public static Item of(Long id, String descricao, BigDecimal preco){
		checkNotNull(id);
		checkNotNull(descricao);
		checkNotNull(preco);
		return new Item(id, descricao, preco);
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

	public BigDecimal getPreco() {
		return preco;
	}
	
	
	
}
