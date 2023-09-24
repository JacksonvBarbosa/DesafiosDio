package util.Aparelho;

import util.app.internet.NavegadorInternet;
import util.app.musica.ReprodutorMusical;
import util.app.telefone.AparelhoTelefonico;

public class AparelhoSmartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void abriAplicativoTelefone() {
        System.out.println("Aplicativo Telefonico Aberto Pelo Smartphone");
    }

    public void abrirAplicativoDaInternet() {
        System.out.println("Aplicativo da Internet aberto Pelo Smartphone");
        validarConectadoInternet();
    }

    public void abrirAplicativoMusical() {
        System.out.println("Aplicativo Músical Aberto Pelo Smartphone");
    }


    private void validarConectadoInternet() {
        System.out.println("Conexão com Internet Estabelecida");
    }
}
