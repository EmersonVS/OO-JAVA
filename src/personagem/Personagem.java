package personagem;

public class Personagem {

	private String Nome;
	private int Nivel;
	
	public Personagem(String nome, int nivel) {
		this.Nome = nome;
		this.Nivel = nivel;
	}
	
	public String getNome() {
		return Nome;
	}
	public int getNivel() {
		return Nivel;
	}
	
}
