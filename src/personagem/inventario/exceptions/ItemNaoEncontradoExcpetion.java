package personagem.inventario.exceptions;

public class ItemNaoEncontradoExcpetion extends IException {

	public ItemNaoEncontradoExcpetion(String msg) {
		super(String.format("Item %s não está no inventário.", msg));
	}

	private static final long serialVersionUID = 1L;

}
