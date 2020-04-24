package personagem.atributos;

public class Atributos {

	private Atributo Forca;
	private Atributo Inteligencia;
	private Atributo Destreza;

	public Atributo getForca() {
		return Forca;
	}

	public Atributo getInteligencia() {
		return Inteligencia;
	}

	public Atributo getDestreza() {
		return Destreza;
	}

	public Atributos(int nivelForca, int nivelInteligencia, int nivelDestreza) {
		this.Forca = new Forca(nivelForca);
		this.Inteligencia = new Inteligencia(nivelInteligencia);
		this.Destreza = new Destreza(nivelDestreza);
	}

	public void evouluirForca(int nivel) {
		getForca().subirNivel(nivel);
	}

	public void evoluirInteligencia(int nivel) {
		getInteligencia().subirNivel(nivel);
	}

	public void evouluirDestreza(int nivel) {
		getDestreza().subirNivel(nivel);
	}
	
	@Override
	public String toString() {
		return String.format("[%s | %s | %s]", getForca(), getInteligencia(), getDestreza());
	}
}
