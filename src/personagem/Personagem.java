package personagem;

import personagem.classes.Classe;

public class Personagem {

	private String Nome;
	private int Nivel;
	private Classe Classe;
	
	public Personagem(String nome, int nivel, Classe classe) {
		this.Nome = nome;
		this.Nivel = nivel;
		this.Classe = classe;
	}
	
	public String getNome() {
		return Nome;
	}
	public int getNivel() {
		return Nivel;
	}
	
	public Classe getClasse() {
		return Classe;
	}

	@Override
	public String toString() {
		return String.format("[Personagem - %s | Nivel - %d | %s" , getNome(), getNivel(), getClasse());
	}
}
