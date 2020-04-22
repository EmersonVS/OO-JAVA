package cadastro.exceptions;

public class TamanhoInvalidoExcpetion extends ECadastro {

	private static final long serialVersionUID = 1L;

	public TamanhoInvalidoExcpetion(String msg) {
		super("Tamanho do campo " + msg + " inválido.");
	}
	
	public TamanhoInvalidoExcpetion() {
		super("Tamanho dos campos inválidos");
	}
	
}
