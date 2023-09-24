package util.app.musica;

import java.util.Scanner;

public class Ipad implements ReprodutorMusical{

    //instancia
    Scanner sc = new Scanner(System.in);

    public void abrirAplicativoMusical() {
        System.out.println("Ipad Funcionando");
        chamarMenu();
    }
    public void chamarMenu() {
        while(true) {
            System.out.print("\nTocar   Pausar  Selecionar    Desligar\n");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("tocar")) {
                tocar();
            } else if (opcao.equalsIgnoreCase("pausar")) {
                pausar();
            } else if (opcao.equalsIgnoreCase("selecionar")) {
                selecionarMusica();
            } else if (opcao.equalsIgnoreCase("desligar")) {
                System.out.println("Obrigado até a próxima");
                break;
            }
        }

    }

    private void tocar() {
        System.out.println("Tocando Música");
    }

    private void pausar() {
        System.out.println("Música Pausada");
    }

    private void selecionarMusica() {
        System.out.println("Música Slecionada");
    }
}
