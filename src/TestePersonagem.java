import cadastro.CadastraPersonagem;
import personagem.Personagem;

public class TestePersonagem {

	public static void main(String[] args) {
		
		CadastraPersonagem AuxCadastro = new CadastraPersonagem();
		
		AuxCadastro.Cadastrar("Aragorn", "Guerreiro", 1, 3, 5);
		AuxCadastro.Cadastrar("Legolas", "Arqueiro", 5, 5, 5);
		AuxCadastro.Cadastrar("Gandalf", "Mago", 3, 2, 5);
		
		for (Personagem Personagem : AuxCadastro.ListaDePersonagens()) {
			System.out.println(Personagem);
		}
	}
}
