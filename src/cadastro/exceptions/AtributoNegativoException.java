package cadastro.exceptions;

public class AtributoNegativoException extends ECadastro {

	private static final long serialVersionUID = 1L;

	public AtributoNegativoException() {
		super(String.format("Valor de atributo é negativo"));
	}
}
