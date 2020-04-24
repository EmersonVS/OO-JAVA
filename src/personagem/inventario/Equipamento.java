package personagem.inventario;

public class Equipamento extends Item {

	public Equipamento(String nome) {
		super(nome, 1);
		this.setTipo("Equipamento");
	}
}
