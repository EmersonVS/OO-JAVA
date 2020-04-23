package cadastro.exceptions;

public class NomeDePersonagemEmUsoException extends ECadastro {

	public NomeDePersonagemEmUsoException() {
		super("Nome do Personagem está em uso.");
	}
	
	public NomeDePersonagemEmUsoException(String msg) {
		super(String.format("Nome %s em uso.", msg));
	}

}
