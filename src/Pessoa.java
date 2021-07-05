public abstract class Pessoa {
    protected String nome;
    protected Integer idade;
    protected String sexo;
    protected Double experiencia;

    /// Construtor
    
    public Pessoa(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0d;
    }
    

    /// Getter e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Double experiencia) {
        this.experiencia = experiencia;
    }

    /// Metodos
    protected void ganharExp() {
        this.experiencia ++;
    }

    @Override
    public String toString() {
        return "Pessoa [experiencia=" + experiencia + ", idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

    
}
