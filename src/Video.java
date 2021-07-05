public class Video implements AcoesVideo {
    private String titulo;
    private Integer avaliacao;
    private Integer visualizacoes;
    private Integer curtidas;
    private boolean reproduzindo;

    /// Constructor

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.visualizacoes = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    /// Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.visualizacoes);
        this.avaliacao = nova;
    }

    public Integer getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(Integer visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    /// Metodos

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video [avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo
                + ", titulo=" + titulo + ", visualizacoes=" + visualizacoes + "]";
    }

}
