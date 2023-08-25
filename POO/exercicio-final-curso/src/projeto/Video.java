package projeto;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // metodo construtor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // Metodos especiais
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo( String title){
        this.titulo = title; 
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }

    public void setAvalicao(int avaliacao){
        int nova;
        nova = (this.avaliacao + avaliacao ) / this.views;
        this.avaliacao =  nova;
    }

    public int getViews(){
        return this.views;
    }

    public void setViews(int views){
        this.views = views;
    }

    public int getCurtidas(){
        return this.curtidas;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo(){
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }

    // metodos especiais
    @Override
    public void play(){
        this.reproduzindo = true;
    }

    @Override
    public void pause(){
        this.reproduzindo = false;
    }

    @Override
    public void like(){
        this.curtidas++;
    }

    @Override
    public String toString(){
        return "Video{" + "titulo = " + titulo + ", avaliacao = " +
                avaliacao + ", views = " + views + ", curtidas = " +
                curtidas + ", reproduzindo = " + reproduzindo + "}"; 
    }
}
