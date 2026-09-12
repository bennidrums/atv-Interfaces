import Notificacao.Notificador;
import  Notificacao.EmailNotificador;
import  Notificacao.SmsNotificador;
import  Notificacao.WhatsappNotificador;
import  Usuario.UsuarioService;

public class NotificacaoMain {

    public static void main(String[] args) {

        new UsuarioService(new EmailNotificador()).registrar("Paulo");
        new UsuarioService(new WhatsappNotificador()).registrar("João");
        new UsuarioService(new SmsNotificador()).registrar("Maria");

    }
}
