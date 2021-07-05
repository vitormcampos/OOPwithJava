import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Video> videos = new ArrayList<>();
        List<Gafanhoto> gafanhotos = new ArrayList<>();

        Video video0001 = new Video("Primeiro video do canal");
        Gafanhoto gafanhoto0001 = new Gafanhoto("Vitor Campos", 21, "M", "vitormcampos");

        gafanhotos.add(gafanhoto0001);

        videos.add(video0001);

        for (Video video : videos) {
            System.out.println(video);
        }
        for (Gafanhoto gafanhoto : gafanhotos) {
            System.out.println(gafanhoto);
        }

    }
}
