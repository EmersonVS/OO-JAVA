package personagem.classes;

public class Guerreiro extends Classe{

	@Override
	public String toString() {
		return String.format("Classe - Guerreiro\nHabilidades - %s", this.getHabilidades());
	}
}
