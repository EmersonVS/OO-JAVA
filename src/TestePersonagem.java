import cadastro.CadastraPersonagem;
import personagem.Personagem;

public class TestePersonagem {

	public static void main(String[] args) {
		
		CadastraPersonagem AuxCadastro = new CadastraPersonagem();
		
		AuxCadastro.Cadastrar("Gandalf", "Mago", 3, 2, 5);
		AuxCadastro.Cadastrar("Aragorn", "Guerreiro", 2, 3, 5);
		AuxCadastro.Cadastrar("Legolas", "Arqueiro", 5, 5, 5);

		
		for (Personagem Personagem : AuxCadastro.ListaDePersonagens()) {
			if(Personagem.equals("Aragorn")) {
				Personagem.getAtributos().evouluirDestreza(3);
			}
			System.out.println(Personagem);
		}
	}
}
