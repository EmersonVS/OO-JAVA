package cadastro;

import java.util.Collection;

import cadastro.exceptions.ClasseInvalidaException;
import cadastro.exceptions.ECadastro;
import cadastro.exceptions.ValorDeAtributoInvalidoException;
import personagem.Personagem;
import personagem.atributos.Atributos;
import personagem.classes.Arqueiro;
import personagem.classes.Classe;
import personagem.classes.Guerreiro;
import personagem.classes.Mago;

public class CadastraPersonagem {

	RegistraPersonagem RegPerso = new RegistraPersonagem();

	public void Cadastrar(String nome, String classe, int nivelForca, int nivelInteligencia, int nivelDestreza) {
		try {
			Personagem NovoPersonagem = new Personagem(nome, 1, DefinirClasse(classe), DefinirAtributos(nivelForca, nivelInteligencia, nivelDestreza));
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
	
	private Atributos DefinirAtributos(int nivelForcaEnviado, int nivelInteligenciaEnviado, int nivelDestrezaEnviado) throws ValorDeAtributoInvalidoException {
		if(nivelForcaEnviado + nivelInteligenciaEnviado + nivelDestrezaEnviado != 10) {
			throw new ValorDeAtributoInvalidoException(nivelForcaEnviado + nivelInteligenciaEnviado + nivelDestrezaEnviado);
		}
		return new Atributos(nivelForcaEnviado,nivelInteligenciaEnviado,nivelDestrezaEnviado);
	}
}
