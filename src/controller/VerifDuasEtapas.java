package controller;

public class VerifDuasEtapas {
	
	public void logando(String nome, String senha) {
		System.out.println("Usuario " + nome + " realizando login no sistema com confirmação de duas etapas");
	}
	
	public void confirmarLogin(int codigoConfirmacao) {
		System.out.println("Confirmando o login com o código de confirmação: " + codigoConfirmacao);
	}
}
