package view;

import controller.IServicoLogar;
import controller.Token;
import controller.TokenAdapter;
import controller.VerifDuasEtapas;
import controller.VerifDuasEtapasAdapter;
import model.Login;
import model.LoginBuilder;

public class Principal {
	
	public static void main(String[] args) {
		
//		Login login = LoginBuilder.builder()
//				.loginPadrao("Henrique Neves", "0101")
//				.codigoConfirmacao(2020)
//				.getLogin();
//	
//
//		VerifDuasEtapas loginDuasEtapas = new VerifDuasEtapas();
//		IServicoLogar iLogin = new VerifDuasEtapasAdapter(loginDuasEtapas);
//		iLogin.logar(login);
		
		Login login = LoginBuilder.builder().token(011101001).getLogin();
		
		Token loginToken = new Token();
		IServicoLogar iToken = new TokenAdapter(loginToken);
		iToken.logar(login);
	}
}
