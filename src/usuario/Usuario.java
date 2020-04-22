package usuario;

public class Usuario {
	
	private String Login;
	private String Senha;
	
	public Usuario(String login, String senha) {
		this.Login = login;
		this.Senha = senha;
	}
	
	public String getLogin() {
		return Login;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	
	@Override
	public String toString() {
		return String.format("[Usuario: %s | Senha: %s]", Login, Senha);
	}
	
}
