import java.util.ArrayList;

public class Register {

    private ArrayList<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {
        medlemmar.add(medlem);
    }
    public void visaMedlemmar() {
        for (Medlem medlem : medlemmar) {
            System.out.println(medlem.getNamn() + " - " + medlem.getMedlemsnummer());
        }
    }

}