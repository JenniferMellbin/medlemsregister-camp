import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void läggTill(Medlem medlem) {
        medlemmar.add(medlem);
    }
        public void listaAlla() {


        for (Medlem medlem : medlemmar) {
            System.out.println(medlem.getNamn() + " - " + medlem.getMedlemsnummer());
        }
    }

}