import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {
        medlemmar.add(medlem);
    }
    public void visaMedlemmar() {
        for (Medlem medlem : medlemmar) {
            System.out.println(medlem.getNamn() + " - " + medlem.getMedlemsnummer());
        }
    }

}