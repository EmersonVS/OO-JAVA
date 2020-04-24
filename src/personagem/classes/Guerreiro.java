package personagem.classes;

public class Guerreiro extends Classe{
	
	public Guerreiro() {
		this.setNome("Guerreiro");
		this.AdicionarHabilidade("Soco", 1, 3);
		this.AdicionarHabilidade("Chute", 1, 3);
		this.AdicionarHabilidade("Corrida", 1, 5);
	}
}
