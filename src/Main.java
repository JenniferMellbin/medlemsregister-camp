public class Main {
    public static void main(String[] args) {
        System.out.println("Medlemsregister v1.0");
        Register register = new Register();

        Medlem medlem = new Medlem("Kim", 1001);
        register.laggTillMedlem(medlem);
        Medlem medlem2 = new Medlem("Moa", 1002);
        register.laggTillMedlem(medlem2);

        register.visaMedlemmar();

    }
}