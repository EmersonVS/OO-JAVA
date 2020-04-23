package cadastro.exceptions;

public class ClasseInvalidaException extends ECadastro {

	private static final long serialVersionUID = 1L;

	public ClasseInvalidaException() {
		super("Classe selecionada � inv�lida");
	}
	
	public ClasseInvalidaException(String msg) {
		super(String.format("Classe selecionada %s � inv�lida.", msg));
	}

}
