package personagem.atributos;

public class Destreza extends Atributo {

	public Destreza(int nivel) {
		super(nivel);
	}

	@Override
	public String toString() {
		return String.format("[%s | Nivel %d]", getNome(), getNivel());
	}

	@Override
	public String getNome() {
		return "Destreza";
	}

}
