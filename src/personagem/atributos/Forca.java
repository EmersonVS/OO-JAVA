package personagem.atributos;

public class Forca extends Atributo {

	public Forca(int nivel) {
		super(nivel);
	}

	@Override
	public String toString() {
		return String.format("[%s | Nivel %d]", getNome(), getNivel());
	}

	@Override
	public String getNome() {
		return "Forca";
	}
}
