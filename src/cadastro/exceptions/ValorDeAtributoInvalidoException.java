package cadastro.exceptions;

public class ValorDeAtributoInvalidoException extends ECadastro {

	private static final long serialVersionUID = 1L;

	public ValorDeAtributoInvalidoException() {
		super("Valor dos atributos enviados é inválido.");
	}

	public ValorDeAtributoInvalidoException(int msg) {
		 super(String.format("Valor da somatória dos atributos enviados deve ser igual a 10. Valor enviado é de %d.", msg));
	}
	
}
