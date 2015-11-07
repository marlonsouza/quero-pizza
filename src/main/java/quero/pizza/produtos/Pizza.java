package quero.pizza.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="pizzas")
public class Pizza extends Item {

	@Enumerated(EnumType.ORDINAL)
	@Column(name="tamanho")
	private TamanhoPizza tamanho;

	public TamanhoPizza getTamanho() {
		return tamanho;
	}

	public void setTamanho(TamanhoPizza tamanho) {
		this.tamanho = tamanho;
	}
	
}
