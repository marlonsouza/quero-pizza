package quero.pizza.produtos;

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
	private Double preco;

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
	
}
