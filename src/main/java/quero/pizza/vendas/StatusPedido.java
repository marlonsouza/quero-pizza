package quero.pizza.vendas;

public enum StatusPedido {

	NOVO(1,"Novo"),
	COZINHANDO(2,"Cozinhando"),
	ENTREGANDO(3,"Entregando");
	
	private final Integer id;
	private final String description;
	
	private StatusPedido(Integer id,String description){
		this.description = description;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.description;
	}
	
	public Integer getId(){
		return id;
	}
}
