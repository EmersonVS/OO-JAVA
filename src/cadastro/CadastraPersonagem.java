package cadastro;

import java.util.Collection;

import cadastro.exceptions.ClasseInvalidaException;
import cadastro.exceptions.ECadastro;
import personagem.Personagem;
import personagem.classes.Arqueiro;
import personagem.classes.Classe;
import personagem.classes.Guerreiro;
import personagem.classes.Mago;

public class CadastraPersonagem {

	RegistraPersonagem RegPerso = new RegistraPersonagem();

	public void Cadastrar(String nome, String classe) {
		try {
			Personagem NovoPersonagem = new Personagem(nome, 1, DefinirClasse(classe));
			RegPerso.AdicionarPersonagem(NovoPersonagem);
		} catch (ECadastro ex) {
			System.out.println(ex.getMessage());
		}

	}

	public Collection<Personagem> ListaDePersonagens() {
		return RegPerso.getPersonagensCadastrados();
	}

	private Classe DefinirClasse(String classe) throws ClasseInvalidaException {
		switch (classe) {
		case "Guerreiro":
			return new Guerreiro();
		case "Arqueiro":
			return new Arqueiro();
		case "Mago":
			return new Mago();
		}
		throw new ClasseInvalidaException(classe);
	}
}
