package entidades;

public class Professor extends Pessoa {
    private String especialidade;
    private Double salario;

    /// Methods

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    /// Getters

    public String getEspecialidade() {
        return especialidade;
    }
    public Double getSalario() {
        return salario;
    }

    /// Setters

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
