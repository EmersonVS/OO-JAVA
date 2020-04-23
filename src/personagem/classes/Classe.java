package personagem.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import personagem.habilidades.Habilidade;

public abstract class Classe implements IClasse{

	private Collection<Habilidade> Habilidades = new ArrayList<Habilidade>();

	public void AdicionarHabilidade(String nome, int nivel, double cooldown) {
		Habilidade NovaHabilidade = new Habilidade(nome, nivel, cooldown);
		Habilidades.add(NovaHabilidade);
	}
	
	public void EvoluirHabilidade(int index, int niveis) {
		((ArrayList<Habilidade>) Habilidades).get(index).EvoluirHabilidade(niveis);
	}

	public Collection<Habilidade> getHabilidades() {
		return Collections.unmodifiableCollection(Habilidades);
	}
	
	public abstract String toString();
}
