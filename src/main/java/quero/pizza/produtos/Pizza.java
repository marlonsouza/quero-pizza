package quero.pizza.produtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pizzas")
public class Pizza extends Item {

	@Column(name="preco_pequena")
	private Double precoPequena;
	
	@Column(name="preco_media")
	private Double precoMedia;;
	
	@Column(name="preco_grande")
	private Double precoGrande;

	public Double getPrecoPequena() {
		return precoPequena;
	}

	public void setPrecoPequena(Double precoPequena) {
		this.precoPequena = precoPequena;
	}

	public Double getPrecoMedia() {
		return precoMedia;
	}

	public void setPrecoMedia(Double precoMedia) {
		this.precoMedia = precoMedia;
	}

	public Double getPrecoGrande() {
		return precoGrande;
	}

	public void setPrecoGrande(Double precoGrande) {
		this.precoGrande = precoGrande;
	}
	
}
