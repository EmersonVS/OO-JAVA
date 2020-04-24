package personagem.atributos;

public class Inteligencia extends Atributo {

	public Inteligencia(int nivel) {
		super(nivel);
	}

	@Override
	public String toString() {
		return String.format("[%s | Nivel %d]", getNome(), getNivel());
	}

	@Override
	public String getNome() {
		return "Inteligencia";
	}

}
