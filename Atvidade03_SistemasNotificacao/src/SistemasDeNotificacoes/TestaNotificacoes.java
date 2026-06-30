package SistemasDeNotificacoes;

public class TestaNotificacoes {

	public static Notificacao criarNotificacao(String tipo, String destinatario) {
	
		if (tipo.equalsIgnoreCase("Email")) {
			 return new NotificacaoEmail(destinatario);
	         
	     } else if (tipo.equalsIgnoreCase("SMS")) {
	    	 return new NotificacaoSms(destinatario);
	   
	      } else {
	    	  throw new IllegalArgumentException("Tipo de notificação inexistente!");
	        }
	    }

    public static void main(String[] args) {
        
      System.out.println("--- TESTE 1: ENVIO DE EMAIL VÁLIDO ---");
        try {
    
        Notificacao email = criarNotificacao("Email", "vitoria@generation.com");
         email.enviar("Olá! Seu código funcionou!");
      } catch (IllegalArgumentException e) {
       System.out.println("Erro inesperado no e-mail: " + e.getMessage());
        }

        System.out.println("\n--- TESTE 2: ENVIO DE SMS VÁLIDO ---");
        try {
          
         Notificacao sms = criarNotificacao("SMS", "11999999999");
         sms.enviar("Seu codigo de verificação é 1234");
        } catch (IllegalArgumentException e) {
         System.out.println("Erro inesperado no SMS: " + e.getMessage());
        }

        System.out.println("\n--- TESTE 3: CENÁRIO DE ERRO (TIPO INEXISTENTE) ---");
        try {
           
         Notificacao invalida = criarNotificacao("WhatsApp", "11999999999");
          invalida.enviar("Essa mensagem não deve ser enviada.");
       } catch (IllegalArgumentException e) {
         System.out.println("Sucesso no teste de erro! Capturado: " + e.getMessage());
        }
        
    }
}

