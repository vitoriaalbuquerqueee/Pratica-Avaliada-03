package SistemasDeNotificacoes;

public class NotificacaoEmail extends  Notificacao {

	public NotificacaoEmail(String destinatario) {
		super(destinatario);
		Validacao.validarEmail(destinatario);
	}
		@Override
		public void enviar(String mensagem) {
			System.out.println("Encaminhando o Email para: " + getDestinatario());
		}
	
}
