public class Main {
    public static void main(String[] args) {

        Register register = new Register();
        register.laggTillMedlem(new Medlem("Anna", 101));
        register.laggTillMedlem(new Medlem("Erik", 102));
        register.visaMedlemmar();
    }
}