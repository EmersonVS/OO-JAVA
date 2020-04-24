import cadastro.CadastraPersonagem;
import personagem.Personagem;
import personagem.inventario.Consumiveis;

public class TestePersonagem {

	public static void main(String[] args) {

		CadastraPersonagem AuxCadastro = new CadastraPersonagem();

		AuxCadastro.Cadastrar("Aragorn", "Guerreiro", 2, 3, 5);
		AuxCadastro.Cadastrar("Gandalf", "Mago", 3, 2, 5);
		AuxCadastro.Cadastrar("Legolas", "Arqueiro", 0, 5, 5);

		for (Personagem Personagem : AuxCadastro.ListaDePersonagens()) {
			if (Personagem.equals("Aragorn")) {
				Personagem.getAtributos().evouluirDestreza(3);
				Personagem.getInventario().AdicionarItemNoInventario(new Consumiveis("Poção de vida", 5));
			}
			System.out.println(Personagem);
		}
	}
}
