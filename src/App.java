import contract.NavegadorInternet;
import contract.ReprodutorMusical;
import model.GoogleChrome;
import model.Iphone;
import model.Ipod;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba("https://www.youtube.com");
        iphone.atualizarPagina();

        iphone.selecionarMusica("Astronomia");
        iphone.tocar();
        iphone.pausar();

        ReprodutorMusical ipod = new Ipod();

        ipod.selecionarMusica("Astronomia");
        ipod.tocar();
        ipod.pausar();

        NavegadorInternet googleChrome = new GoogleChrome();

        googleChrome.exibirPagina("https://www.google.com");
        googleChrome.adicionarNovaAba("https://www.youtube.com");
        googleChrome.atualizarPagina();
    }
}
