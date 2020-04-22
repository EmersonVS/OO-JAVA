package cadastro.exceptions;

public class CaracterInvalidoException extends ECadastro{

	private static final long serialVersionUID = 1L;

	public CaracterInvalidoException() {
		super("Caracter inv�lido");
	}
	
	public CaracterInvalidoException(String msg) {
		super("Caracter inv�lido no campo " + msg + ".");
	}

}
