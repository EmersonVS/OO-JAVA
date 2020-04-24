package personagem.classes;

public class Arqueiro extends Classe {

	public Arqueiro() {
		this.setNome("Arqueiro");
		this.AdicionarHabilidade("Disparo", 1, 4);
		this.AdicionarHabilidade("Esquiva", 1, 2);
		this.AdicionarHabilidade("Precisão", 1, 8);
	}
}
