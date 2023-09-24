package util.app.telefone;

import java.util.Scanner;

public class Telefone implements AparelhoTelefonico{

    Scanner sc = new Scanner(System.in);
    public void abriAplicativoTelefone() {
        System.out.println("Telefone Aberto");
        chamarMenu();
    }

    public void chamarMenu() {
        while (true) {
            System.out.print("\nLigar  Atender   Correio   Desligar\n");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("ligar")) {
                ligar();
            } else if (opcao.equalsIgnoreCase("atender")) {
                atender();
            } else if (opcao.equalsIgnoreCase("correio")) {
                iniciarCorreioVoz();
            } else if (opcao.equalsIgnoreCase("desligar")) {
                System.out.println("Chamada Encerrada");
                break;
            }
        }
    }

    private void ligar() {
        System.out.println("Ligando");
    }

    private void atender() {
        System.out.println("Atendendo");
    }

    private void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Inicado");
    }
}
