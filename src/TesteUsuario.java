import cadastro.CadastraUsuario;

public class TesteUsuario {

	public static void main(String[] args) {
		
		CadastraUsuario AuxCadastro = new CadastraUsuario();
		
		AuxCadastro.Cadastrar("GuilhermeAAR", "paocarnequeijopaoquarteirao");
		
		System.out.println(AuxCadastro.ListaDeUsuarios());

	}
}