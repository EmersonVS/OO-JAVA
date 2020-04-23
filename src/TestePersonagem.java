import cadastro.CadastraPersonagem;
import personagem.Personagem;

public class TestePersonagem {

	public static void main(String[] args) {
		
		CadastraPersonagem AuxCadastro = new CadastraPersonagem();
		
		AuxCadastro.Cadastrar("Aragorn", 1, "Guerreiro");
		AuxCadastro.Cadastrar("Legolas", 1, "Arqueiro");
		AuxCadastro.Cadastrar("Gandalf", 1, "Mago");
		
		for (Personagem Personagem : AuxCadastro.ListaDePersonagens()) {
			System.out.println(Personagem);
		}
	}
}
