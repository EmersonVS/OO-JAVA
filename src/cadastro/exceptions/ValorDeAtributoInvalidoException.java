package cadastro.exceptions;

public class ValorDeAtributoInvalidoException extends ECadastro {

	public ValorDeAtributoInvalidoException() {
		super("Valor dos atributos enviados � inv�lido.");
	}

	public ValorDeAtributoInvalidoException(int msg) {
		 super(String.format("Valor dos atributos enviados deve ser igual a 10. Valor enviado � de %d.", msg));
	}
	
}
