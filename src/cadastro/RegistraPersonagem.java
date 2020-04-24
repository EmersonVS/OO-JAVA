package cadastro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import cadastro.exceptions.ECadastro;
import cadastro.exceptions.NomeDePersonagemEmUsoException;
import cadastro.exceptions.TamanhoInvalidoExcpetion;
import personagem.Personagem;

public class RegistraPersonagem {
	private Collection<Personagem> ListaPersonagemCadastrados = new ArrayList<Personagem>();

	public Collection<Personagem> getPersonagensCadastrados() {
		return Collections.unmodifiableCollection(ListaPersonagemCadastrados);
	}

	public void AdicionarPersonagem(Personagem personagemEnviado) {
		try {
			if (validarUsoDeNome(personagemEnviado) && validarTamanhoDoNome(personagemEnviado)) {
				ListaPersonagemCadastrados.add(personagemEnviado);
			}
		} catch (ECadastro ex) {
			System.out.println(ex.getMessage());
		}

	}

	private boolean validarUsoDeNome(Personagem personagemEnviado) throws NomeDePersonagemEmUsoException {
		for (Personagem personagem : ListaPersonagemCadastrados) {
			if (personagem.getNome().equals(personagemEnviado.getNome())) {
				throw new NomeDePersonagemEmUsoException(personagemEnviado.getNome());
			}
		}
		return true;
	}
	
	private boolean validarTamanhoDoNome(Personagem personagemEnviado) throws TamanhoInvalidoExcpetion {
		if (personagemEnviado.getNome().length() < 1 || personagemEnviado.getNome().equals("")
				|| personagemEnviado.getNome().equals(" "))
			throw new TamanhoInvalidoExcpetion("Nome do Personagem");
		return true;
	}
}
