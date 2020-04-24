package personagem.classes;

public class Mago extends Classe {

	public Mago() {
		this.setNome("Mago");
		this.AdicionarHabilidade("Bola de Energia", 1, 5);
		this.AdicionarHabilidade("Rajada de Energia", 1, 5);
		this.AdicionarHabilidade("Teletransporte", 1, 3);
	}
}
