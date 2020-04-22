import cadastro.Cadastro;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Cadastro AuxCadastro = new Cadastro();
		
		AuxCadastro.Cadastrar("GuilhermeAAR", "paocarnequeijopaoquarteirao");
		
		System.out.println(AuxCadastro.ListaDeUsuarios());

	}
}