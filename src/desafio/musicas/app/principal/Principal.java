package desafio.musicas.app.principal;

import desafio.musicas.app.modelos.MeusFavoritos;
import desafio.musicas.app.modelos.Musica;
import desafio.musicas.app.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("The Weight");
        minhaMusica.setArtista("The Band");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }


        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }


        MeusFavoritos preferidas = new MeusFavoritos();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
