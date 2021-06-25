package entidades;

public abstract class Pessoa {
    protected String nome;
    protected Integer idade;
    protected String sexo;

    /// Methods

    public final void fazerAniversario() {
    }

    /// Getters

    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }

    /// Setters
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa[" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }
}
