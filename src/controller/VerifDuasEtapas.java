package controller;

public class VerifDuasEtapas {
	
	public void logando(String nome, String senha) {
		System.out.println("Usuario " + nome + " realizando login no sistema com confirma��o de duas etapas");
	}
	
	public void confirmarLogin(int codigoConfirmacao) {
		System.out.println("Confirmando o login com o c�digo de confirma��o: " + codigoConfirmacao);
	}
}
