public class App {
    public static void main(String[] args) throws Exception {
        Lutador[] lutadores = new Lutador[2];

        Lutador l0 = new Lutador("Pretty Boy", "França", 31, 1.75d, 68.9d, 11, 2, 1);
        Lutador l1 = new Lutador("Putscript", "Brasil", 29, 1.68d, 57.8d, 14, 2, 3);

        lutadores[0] = l0;
        lutadores[1] = l1;

        Luta luta000 = new Luta();

        luta000.marcarLuta(lutadores[0], lutadores[1]);
        luta000.lutar();

    }
}
