package model;

public class Login {
	
	private String usuario;
	private String senha;
	private long token;
	private int codigoConfirmacao;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public long getToken() {
		return token;
	}
	public void setToken(long token) {
		this.token = token;
	}
	public int getCodigoConfirmacao() {
		return codigoConfirmacao;
	}
	public void setCodigoConfirmacao(int codigoConfirmacao) {
		this.codigoConfirmacao = codigoConfirmacao;
	}
	@Override
	public String toString() {
		return "Login [usuario=" + usuario + ", senha=" + senha + ", token=" + token + ", codigoConfirmacao="
				+ codigoConfirmacao + "]";
	}
	
	
	
	

}
