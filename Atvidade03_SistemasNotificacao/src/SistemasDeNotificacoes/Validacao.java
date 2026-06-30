package SistemasDeNotificacoes;

public class Validacao {

	public static void validarEmail(String email) {
	
		   if ((email == null  || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))) {
			      throw new IllegalArgumentException("Email Digitado, invalido!");
		   }
	}
	
  public static void validarSMS(String telefone) 	 {      
	  if (telefone == null || telefone.trim().isEmpty() || !telefone.matches("^\\d{11}$")) {
			throw new IllegalArgumentException("Erro!\n O Telefone digitado é inválido! Insira DDD + 9 dígitos (apenas números).!");      
			      
			      
	}
	}
}
