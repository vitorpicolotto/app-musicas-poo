package desafio.musicas.app.modelos;

public class MeusFavoritos {

    public void inclui (Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " está entre meus favoritos!");
        } else {
            System.out.println("Você deveria dar uma chance para " + audio.getTitulo());
        }
    }

}
