import cadastro.CadastraPersonagem;
import personagem.Personagem;

public class TestePersonagem {

	public static void main(String[] args) {
		
		CadastraPersonagem AuxCadastro = new CadastraPersonagem();
		
		AuxCadastro.Cadastrar("Aragorn", "Guerreiro");
		AuxCadastro.Cadastrar("Legolas", "Arqueiro");
		AuxCadastro.Cadastrar("Gandalf", "Mago");
		
		for (Personagem Personagem : AuxCadastro.ListaDePersonagens()) {
			System.out.println(Personagem);
		}
	}
}
