package personagem.inventario;

public abstract class Item {

	private String Nome;
	private int Quantidade;
	private String Tipo;

	public Item(String nome, int quantidade) {
		this.Nome = nome;
		this.Quantidade = quantidade;
	}

	public void AdicionarItem(int quantidade) {
		this.Quantidade += quantidade;
	}

	public String getNome() {
		return Nome;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public String getTipo() {
		return Tipo;
	}

	protected void setTipo(String tipo) {
		this.Tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("[Nome - %s | Tipo - %s | Quantidade - %d]", getNome(), getTipo(), getQuantidade());
	}

	@Override
	public boolean equals(Object itemEnviado) {
		return this.getNome() == ((Item) itemEnviado).Nome && this.getTipo() == ((Item) itemEnviado).Tipo;
	}

}
