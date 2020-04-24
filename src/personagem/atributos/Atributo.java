package personagem.atributos;

public abstract class Atributo {

	private int Nivel;
	
	public Atributo(int nivel) {
		this.Nivel = nivel;
	}

	public int getNivel() {
		return Nivel;
	}

	public void subirNivel(int nivel) {
		this.Nivel += nivel;
	}
	
	public abstract String toString();
	
	public abstract String getNome();
}
