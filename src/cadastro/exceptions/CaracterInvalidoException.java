package cadastro.exceptions;

public class CaracterInvalidoException extends ECadastro{

	private static final long serialVersionUID = 1L;

	public CaracterInvalidoException() {
		super("Caracter inválido");
	}
	
	public CaracterInvalidoException(String msg) {
		super("Caracter inválido no campo " + msg + ".");
	}

}
