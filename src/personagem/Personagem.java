package personagem;

import personagem.atributos.Atributos;
import personagem.classes.Classe;
import personagem.inventario.Inventario;

public class Personagem {

	private String Nome;
	private int Nivel;
	private Classe Classe;
	private Atributos Atributos;
	private Inventario Inventario;
	
	public Personagem(String nome, int nivel, Classe classe, Atributos atributos) {
		this.Nome = nome;
		this.Nivel = nivel;
		this.Classe = classe;
		this.Atributos = atributos;
		this.Inventario = new Inventario();
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
	
	public Atributos getAtributos() {
		return Atributos;
	}

	public Inventario getInventario() {
		return Inventario;
	}
	
	@Override
	public String toString() {
		return String.format("[Personagem - %s | Nivel - %d | Classe - %s | Atributos - %s | Inventario - %s]" , getNome(), getNivel(), getClasse(), getAtributos(), getInventario());
	}
	
	public boolean equals(String nome) {
		return this.getNome().equals(nome);
	}
}
