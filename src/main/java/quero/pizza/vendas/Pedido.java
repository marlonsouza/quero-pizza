package quero.pizza.vendas;

import static com.google.common.base.Preconditions.checkNotNull;

import java.math.BigDecimal;
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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.Serializable;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_pedido")
    private Long id;

    @OneToMany
    @JoinTable(name = "itens_pedidos",
            joinColumns = @JoinColumn(name = "pedido_item"),
            inverseJoinColumns = @JoinColumn(name = "item_pedido"))
    private List<Item> itens = Lists.newArrayList();

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status_pedido")
    private StatusPedido status = StatusPedido.NOVO;

    @Column(name = "data_pedido")
    private LocalDate dataPedido = LocalDate.now();

    @Column(name = "valor_total")
    private BigDecimal valorTotal = BigDecimal.ZERO;

    protected Pedido() {
    }

    private Pedido(List<Item> itens) {
        this.status = StatusPedido.NOVO;
        this.itens.addAll(itens);
        this.valorTotal = totalizarPedido(itens);
    }

    private BigDecimal totalizarPedido(List<Item> itens) {
        return itens.stream().map(i -> i.getPreco()).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static Pedido of(List<Item> itens) {
        checkNotNull(itens);
        return new Pedido(itens);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItem(List<Item> itens) {
        this.itens.clear();
        this.itens.addAll(itens);
        this.valorTotal = totalizarPedido(itens);
    }

    public List<Item> getItens() {
        return ImmutableList.copyOf(itens);
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

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

}
