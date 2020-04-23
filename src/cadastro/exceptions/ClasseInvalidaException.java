package cadastro.exceptions;

public class ClasseInvalidaException extends ECadastro {

	private static final long serialVersionUID = 1L;

	public ClasseInvalidaException() {
		super("Classe selecionada é inválida");
	}
	
	public ClasseInvalidaException(String msg) {
		super(String.format("Classe selecionada %s é inválida.", msg));
	}

}
