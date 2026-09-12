package Notificacao;

public class EmailNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por e-mail: " + mensagem);
    }
}