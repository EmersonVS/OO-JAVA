package cadastro.exceptions;

public class NomeDePersonagemEmUsoException extends ECadastro {

	private static final long serialVersionUID = 1L;

	public NomeDePersonagemEmUsoException() {
		super("Nome do Personagem está em uso.");
	}
	
	public NomeDePersonagemEmUsoException(String msg) {
		super(String.format("Nome %s em uso.", msg));
	}

}
