package cadastro;

import java.util.ArrayList;
import java.util.Collection;

import cadastro.exceptions.CaracterInvalidoException;
import cadastro.exceptions.ECadastro;
import cadastro.exceptions.TamanhoInvalidoExcpetion;
import cadastro.exceptions.UsuarioEmUsoException;
import usuario.Usuario;

public class RegistraUsuario {

	private Collection<Usuario> ListaUsuariosCadastrados = new ArrayList<Usuario>();

	public Collection<Usuario> getUsuariosCadastrados() {
		return ListaUsuariosCadastrados;
	}

	public void AdicionarUsuario(Usuario usuarioEnviado) {
		try {
			if (dadosValidos(usuarioEnviado)) {
				ListaUsuariosCadastrados.add(usuarioEnviado);
			}
		} catch (ECadastro ex) {
			System.out.println(ex.getMessage());
		}
	}

	private boolean dadosValidos(Usuario usuarioEnviado) throws ECadastro {
		return conferirTamanhoLogin(usuarioEnviado) && conferirTamanhoSenha(usuarioEnviado)
				&& conferirDisponibilidadeUsuario(usuarioEnviado) && conferirUsuario(usuarioEnviado)
				&& conferirSenha(usuarioEnviado);
	}

	private boolean conferirDisponibilidadeUsuario(Usuario usuarioEnviado) throws UsuarioEmUsoException {
		for (Usuario usuarioCadastrado : ListaUsuariosCadastrados) {
			if (usuarioCadastrado.getLogin().toUpperCase().equals(usuarioEnviado.getLogin().toUpperCase())) {
				throw new UsuarioEmUsoException();
			}
		}
		return true;
	}

	private boolean conferirUsuario(Usuario usuarioEnviado) throws CaracterInvalidoException {
		for (char letra : usuarioEnviado.getLogin().toCharArray()) {
			if (48 <= (int) letra && (int) letra <= 57 || 65 <= (int) letra && (int) letra <= 90
					|| 97 <= (int) letra && (int) letra <= 122) {
			} else {
				throw new CaracterInvalidoException("Usuario");
			}
		}
		return true;
	}

	
	private boolean conferirSenha(Usuario usuarioEnviado) throws CaracterInvalidoException {
		for (char letra : usuarioEnviado.getSenha().toCharArray()) {
			if (letra == ' ') {
				throw new CaracterInvalidoException("Senha");
			}
		}
		return true;
	}

	private boolean conferirTamanhoLogin(Usuario usuarioEnviado) throws TamanhoInvalidoExcpetion {
		if (usuarioEnviado.getLogin().length() < 1 || usuarioEnviado.getLogin().equals("")
				|| usuarioEnviado.getLogin().equals(" "))
			throw new TamanhoInvalidoExcpetion("Usuario");
		return true;
	}

	private boolean conferirTamanhoSenha(Usuario usuarioEnviado) throws TamanhoInvalidoExcpetion {
		if (usuarioEnviado.getSenha().length() < 1 || usuarioEnviado.getSenha().equals("")
				|| usuarioEnviado.getSenha().equals(" "))
			throw new TamanhoInvalidoExcpetion("Senha");
		return true;
	}
}
