package SistemasDeNotificacoes;

public class NotificacaoSms extends Notificacao {
	
	public NotificacaoSms(String destinatario) {
		
   super(destinatario); 
   Validacao.validarSMS(destinatario);
   
}
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando SMS para:: " + getDestinatario());

}
}
