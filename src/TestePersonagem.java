import cadastro.CadastraPersonagem;
import cadastro.exceptions.ECadastro;
import personagem.Personagem;
import personagem.inventario.Consumiveis;

public class TestePersonagem {

	public static void main(String[] args) {
		
		CadastraPersonagem AuxCadastro = new CadastraPersonagem();
		try {
			AuxCadastro.Cadastrar("Aragorn", "Guerreiro", 10, 0, 0);
		} catch (ECadastro e) {
			e.printStackTrace();
		}
		
		for (Personagem teste : AuxCadastro.ListaDePersonagens()) {
			teste.getInventario().AdicionarItemNoInventario(new Consumiveis("A", 8));
			teste.getInventario().AdicionarItemNoInventario(new Consumiveis("B", 8));
			teste.getInventario().AdicionarItemNoInventario(new Consumiveis("C", 8));
		}
		System.out.println(AuxCadastro.ListaDePersonagens());
	}
}
