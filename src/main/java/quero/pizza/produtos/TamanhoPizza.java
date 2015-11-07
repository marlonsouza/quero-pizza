package quero.pizza.produtos;

public enum TamanhoPizza {
	PEQUENA(1, "Pequena"),
	MEDIA(2, "Média"), 
	GRANDE(3, "Grande");
	
	private final Integer id;
	private final String description;
	
	private TamanhoPizza(Integer id, String description){
		this.id = id;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.description;
	}
	
	public Integer getId(){
		return id;
	}
}
