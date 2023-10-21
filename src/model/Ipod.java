package model;

import contract.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{
    
    @Override
    public void tocar() {
        System.out.println("IPOD Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("IPOD Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("IPOD Selecionando música " + musica);
    }

}
