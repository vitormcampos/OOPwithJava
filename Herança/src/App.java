
import entidades.Aluno;
import entidades.Bolsista;

public class App {
    public static void main(String[] args) throws Exception {

    
        Aluno a1 = new Aluno();
        Bolsista a2 = new Bolsista();

        a1.setNome("Vitor Campos");
        a1.pagarMensalidade();

        a2.setNome("Miquinha");
        a2.pagarMensalidade();



    }
}
