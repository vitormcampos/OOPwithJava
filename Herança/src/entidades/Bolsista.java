package entidades;

public class Bolsista extends Aluno {
    private Integer bolsa;

    /// Methods
    public void renovarBolsa(Integer bolsa) {
        setBolsa(bolsa);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista! Pagamento facilitado ");
    }

    /// Getters

    public Integer getBolsa() {
        return bolsa;
    }

    /// Setters

    public void setBolsa(Integer bolsa) {
        this.bolsa = bolsa;
    }
}
