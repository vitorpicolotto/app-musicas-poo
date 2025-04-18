package desafio.musicas.app.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public double getClassificacao() {
        if (this.getTotalReproducoes() > 2000){
            return 10;
        } else if (this.getTotalReproducoes() > 1000 && this.getTotalReproducoes() <= 2000) {
            return 7;
        } else {
            return 5;
        }
    }
}
