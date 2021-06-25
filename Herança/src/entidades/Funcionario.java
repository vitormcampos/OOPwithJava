package entidades;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    /// Methods

    public void mudaTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

    /// Getters

    public String getSetor() {
        return setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }

    /// Setters

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
