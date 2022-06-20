package model;

public class LoginBuilder {
	
	private Login login;
	
	public LoginBuilder() {
		this.login = new Login();
	}
	
	public static LoginBuilder builder() {
		return new LoginBuilder();
	}
	
	public LoginBuilder loginPadrao(String nome, String senha) {
		this.login.setUsuario(nome);
		this.login.setSenha(senha);
		return this;
	}
	
	public LoginBuilder codigoConfirmacao(int codigoConfirmacao) {
		this.login.setCodigoConfirmacao(codigoConfirmacao);
		return this;
	}
	
	public LoginBuilder token(long token) {
		this.login.setToken(token);
		return this;
	}
	
	public Login getLogin() {
		return this.login;
	}

}
