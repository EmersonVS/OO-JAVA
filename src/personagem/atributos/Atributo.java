package personagem.atributos;

public abstract class Atributo {

	protected String Nome;
	private int Nivel;

	public Atributo(int nivel){
		this.Nivel = nivel;
	}

	public int getNivel() {
		return Nivel;
	}

	public void subirNivel(int nivel) {
		this.Nivel += nivel;
	}

	public String toString() {
		return String.format("[%s | Nivel %d]", getNome(), getNivel());
	}

	protected String getNome() {
		return Nome;
	}

	protected void setNome(String nome) {
		this.Nome = nome;
	}
}
