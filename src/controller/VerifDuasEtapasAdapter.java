package controller;

import model.Login;

public class VerifDuasEtapasAdapter implements IServicoLogar{
	
	private VerifDuasEtapas loginDuasEtapas;
	
	public VerifDuasEtapasAdapter(VerifDuasEtapas loginDuasEtapas) {
		this.loginDuasEtapas = loginDuasEtapas;
	}
	
	
	@Override
	public void logar(Login login) {
	this.loginDuasEtapas.logando(login.getUsuario(), login.getSenha());
	this.loginDuasEtapas.confirmarLogin(login.getCodigoConfirmacao());
	}

}
