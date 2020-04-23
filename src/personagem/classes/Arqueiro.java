package personagem.classes;

public class Arqueiro extends Classe {

	private String Nome = "Arqueiro";

	public Arqueiro() {
		this.AdicionarHabilidade("Disparo", 1, 4);
		this.AdicionarHabilidade("Esquiva", 1, 2);
		this.AdicionarHabilidade("Precisão", 1, 8);
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
