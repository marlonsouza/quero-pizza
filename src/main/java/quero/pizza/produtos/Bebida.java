package quero.pizza.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="refrigerantes")
public class Bebida extends Item{

	@Column(name="marca")
	private String marca;
	
	@Column(name="preco")
	private Double preco;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
