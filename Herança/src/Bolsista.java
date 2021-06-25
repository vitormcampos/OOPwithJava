import entidades.Aluno;

public class Bolsista extends Aluno {
    private Integer r_profissional;

    /// Getters

    public Integer getR_profissional() {
        return r_profissional;
    }

    /// Setters

    public void setR_profissional(Integer r_profissional) {
        this.r_profissional = r_profissional;
    }


    public void praticar() {
        System.out.println("Praticando...");
    }
}
