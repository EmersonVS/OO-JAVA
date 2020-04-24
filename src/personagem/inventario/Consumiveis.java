package personagem.inventario;

public class Consumiveis extends Item{

	public Consumiveis(String nome, int quantidade) {
		super(nome, quantidade);
		this.setTipo("Consumiveis");
	}
}
