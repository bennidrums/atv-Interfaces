package Notificacao;

public class SmsNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por Sms: " + mensagem);
    }
}
