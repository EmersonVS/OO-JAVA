package cadastro.exceptions;

public class UsuarioEmUsoException extends ECadastro{
	
	private static final long serialVersionUID = 1L;

	public UsuarioEmUsoException() {
		super("Nome de usu�rio est� em uso.");
	}	
	
}