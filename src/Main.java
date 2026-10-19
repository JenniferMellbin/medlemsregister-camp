public class Main {
    public static void main(String[] args) {
        System.out.println("Medlemsregister v1.0");
        Register register = new Register();

        Medlem medlem = new Medlem("Kim", 1001);
        register.läggTill(medlem);

        Medlem medlem2 = new Medlem("Moa", 1002);
        register.läggTill(medlem2);

        Medlem medlem3 = new Medlem("Lisa", 1003);
        register.läggTill(medlem3);

        register.listaAlla();

    }
}