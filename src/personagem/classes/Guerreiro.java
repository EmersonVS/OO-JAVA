package personagem.classes;

public class Guerreiro extends Classe{

	private String Nome = "Guerreiro";
	
	public Guerreiro() {
		this.AdicionarHabilidade("Soco", 1, 3);
		this.AdicionarHabilidade("Chute", 1, 3);
		this.AdicionarHabilidade("Corrida", 1, 5);
	}
	
	@Override
	public String toString() {
		return String.format("[%s | Habilidades - %s]", getNome(), this.getHabilidades());
	}

	@Override
	public String getNome() {
		return Nome;
	}
	
}
