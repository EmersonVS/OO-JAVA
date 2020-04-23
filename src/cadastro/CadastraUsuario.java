package cadastro;

import java.util.Collection;

import usuario.Usuario;

public class CadastraUsuario {
	
	RegistraUsuario RegUser = new RegistraUsuario();
	
	public void Cadastrar(String login, String senha){
		Usuario NovoUsuario = new Usuario(login, senha);
		RegUser.AdicionarUsuario(NovoUsuario);
	}
	public Collection<Usuario> ListaDeUsuarios(){
		return RegUser.getUsuariosCadastrados();
	}
}
