package cadastro.exceptions;

public class ValorDeAtributoInvalidoException extends ECadastro {

	private static final long serialVersionUID = 1L;

	public ValorDeAtributoInvalidoException() {
		super("Valor dos atributos enviados � inv�lido.");
	}

	public ValorDeAtributoInvalidoException(int msg) {
		 super(String.format("Valor da somat�ria dos atributos enviados deve ser igual a 10. Valor enviado � de %d.", msg));
	}
	
}
