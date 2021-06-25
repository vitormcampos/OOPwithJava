package entidades;

public class Aluno extends Pessoa{
    protected Integer matricula;
    protected String curso;

    /// Methods
    public void pagarMensalidade() {
        System.out.println("Mensalidade Paga");
    }

    /// Getters

    public Integer getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }

    /// Setters

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
