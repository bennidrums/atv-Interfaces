package Notificacao;

public class WhatsappNotificador implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por Whatsapp: " + mensagem);
    }
}