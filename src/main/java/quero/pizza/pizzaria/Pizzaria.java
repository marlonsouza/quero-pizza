package quero.pizza.pizzaria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pizzarias")
public class Pizzaria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "i_pizzaria")
    private Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "telefone")
    private String telefone;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
