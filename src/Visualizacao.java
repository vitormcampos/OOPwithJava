public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    /// Construtor

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme = filme;
        this.filme.setVisualizacoes(this.filme.getVisualizacoes() + 1);
    }

    /// Getters e Setters
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    /// Metodos

    public void avaliar() {
        filme.setAvaliacao(5);;
    }
    public void avaliar(Integer nota) {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(Float porcentagem) {
        int total = 0;
        if (porcentagem <= 20) {
            total = 3;
        }
        else if (porcentagem <= 50) {
            total = 5;
        }
        else if (porcentagem <= 90) {
            total = 8;
        }
        else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

    
}
