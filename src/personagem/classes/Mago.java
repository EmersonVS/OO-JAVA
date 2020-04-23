package personagem.classes;

public class Mago extends Classe {

	private String Nome = "Mago";
	
	public Mago() {
		this.AdicionarHabilidade("Bola de Energia", 1, 5);
		this.AdicionarHabilidade("Rajada de Energia", 1, 5);
		this.AdicionarHabilidade("Teletransporte", 1, 3);
	}
	
	@Override
	public String toString() {
		return String.format("[%s | Habilidades - %s]",getNome(), this.getHabilidades());
	}

	@Override
	public String getNome() {
		return Nome;
	}

}
