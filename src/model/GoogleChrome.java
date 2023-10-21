package model;

import contract.NavegadorInternet;

public class GoogleChrome implements NavegadorInternet{
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Google Chrome exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Google Chrome adicionando nova aba " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Google Chrome atualizando página");
    }

}
