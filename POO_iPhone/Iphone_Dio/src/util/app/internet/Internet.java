package util.app.internet;

import java.util.Scanner;

public class Internet implements NavegadorInternet {

    //instancia
    Scanner sc = new Scanner(System.in);

    public void abrirAplicativoDaInternet() {
        System.out.println("Navegador Aberto");
        chamarMenu();
    }

    public void chamarMenu() {
        while (true) {
            System.out.print("\nExibir  Adicionar   Atualizar   Fechar\n");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("exibir")) {
                exibirPagina();
            } else if (opcao.equalsIgnoreCase("adicionar")) {
                adicionarNovaPagina();
            } else if (opcao.equalsIgnoreCase("atualizar")) {
                atualizarPagina();
            } else if (opcao.equalsIgnoreCase("fechar")) {
                System.out.println("Página Fechada");
                break;
            }
        }
    }

    private void exibirPagina() {
        System.out.println("Página Aberta");
    }

    private void adicionarNovaPagina() {
        System.out.println("Nova página adicionada");
    }

    private void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

}
