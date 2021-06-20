import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rounds;
    private boolean aprovada;


    //// Methods

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria() == desafiante.getCategoria()) {
            if (desafiado != desafiante) {
                this.aprovada = true;
                this.desafiado = desafiado;
                this.desafiante = desafiante;
            }
            else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
        }
    }

    public void lutar() {
        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            Integer vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiado ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Desafiante ganhou!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        }
        else {
            System.out.println("Luta não pode acontecer!");
        }
    }


    /// Getters

    public Lutador getDesafiado() {
        return desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public Integer getRounds() {
        return rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }

    /// Setters

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
