package personagem.inventario.exceptions;

public class ItemNaoEncontradoExcpetion extends IException {

	public ItemNaoEncontradoExcpetion(String msg) {
		super(String.format("Item %s n�o est� no invent�rio.", msg));
	}

	private static final long serialVersionUID = 1L;

}
