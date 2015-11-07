package quero.pizza.pizzaria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzarias")
public class Pizzaria {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
}
