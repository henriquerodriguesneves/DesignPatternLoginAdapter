package controller;

import model.Login;

public class TokenAdapter implements IServicoLogar{
	
	private Token token;
	
	public TokenAdapter(Token token) {
		this.token = token;
	}
	
	@Override
	public void logar(Login login) {
	this.token.enviarToken(login.getToken());	
		
		
	}

}
