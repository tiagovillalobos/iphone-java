package model;

import contract.*;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

    @Override
    public void tocar() {
        System.out.println("IPHONE Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("IPHONE Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("IPHONE Selecionando música " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("IPHONE Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("IPHONE Adicionando nova aba com página " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("IPHONE Atualizando página");
    }

    @Override
    public void ligar() {
        System.out.println("IPHONE Ligando");
    }

    @Override
    public void atender() {
        System.out.println("IPHONE Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IPHONE Iniciando correio de voz");
    }

}