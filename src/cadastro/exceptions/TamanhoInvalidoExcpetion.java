package cadastro.exceptions;

public class TamanhoInvalidoExcpetion extends ECadastro {

	private static final long serialVersionUID = 1L;

	public TamanhoInvalidoExcpetion(String msg) {
		super("Tamanho do campo " + msg + " inv�lido.");
	}
	
	public TamanhoInvalidoExcpetion() {
		super("Tamanho dos campos inv�lidos");
	}
	
}
