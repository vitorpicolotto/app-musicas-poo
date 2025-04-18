package desafio.musicas.app.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public double getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        } else if (this.getTotalCurtidas() > 250 && this.getTotalCurtidas() <= 500){
            return 7;
        } else {
            return 5;
        }
    }


}



