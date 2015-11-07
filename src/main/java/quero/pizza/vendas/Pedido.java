package quero.pizza.vendas;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import quero.pizza.produtos.Item;

@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_pedido")
	private Long id;

	@OneToMany
	@JoinTable(name="itens_pedidos",
			joinColumns=@JoinColumn(name="pedido_item"),
			inverseJoinColumns=@JoinColumn(name="item_pedido"))
	private List<Item> itens;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="status_pedido")
	private StatusPedido status;
	
	@Column(name="data_pedido")
	private LocalDate dataPedido;
	
	@Column(name="valor_total")
	private Double valorTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
