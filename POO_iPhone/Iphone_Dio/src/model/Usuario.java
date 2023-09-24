package model;

import util.Aparelho.AparelhoSmartphone;
import util.app.internet.Internet;
import util.app.internet.NavegadorInternet;
import util.app.musica.Ipad;
import util.app.musica.ReprodutorMusical;
import util.app.telefone.AparelhoTelefonico;
import util.app.telefone.Telefone;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        //Instancias
        Scanner sc = new Scanner(System.in);
        AparelhoSmartphone ap = new AparelhoSmartphone();
        Ipad ipad = new Ipad();
        Internet internet = new Internet();
        Telefone telefone = new Telefone();
        ReprodutorMusical reprodutorMusical = ipad;
        AparelhoTelefonico aparelhoTelefonico = telefone;
        NavegadorInternet navegadorInternet = internet;



        while(true) {
            System.out.println("Menu  Ipad  Internet  Telefone Sair.\n");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("ipad")) {
                ap.abrirAplicativoMusical();
                reprodutorMusical.abrirAplicativoMusical();
            } else if (opcao.equalsIgnoreCase("internet")) {
                ap.abrirAplicativoDaInternet();
                navegadorInternet.abrirAplicativoDaInternet();
            } else if (opcao.equalsIgnoreCase("telefone")) {
                ap.abriAplicativoTelefone();
                aparelhoTelefonico.abriAplicativoTelefone();
            } else if (opcao.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado");
                break;
            }
        }

        //reprodutorMusical.abrirAplicativoMusical();
        //ipad.abrirAplicativoMusical();

        //ap.abrirAplicativoDaInternet();
        //ap.abriAplicativoTelefone();


    }
}
