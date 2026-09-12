package Usuario;

import Notificacao.Notificador;

public class UsuarioService{

    private Notificador notificador;

    public UsuarioService (Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nome) {
        System.out.println("\nUsuário " + nome + " registrado.");
        notificador.enviarMensagem("Bem-vindo " + nome + "!");
    }
}