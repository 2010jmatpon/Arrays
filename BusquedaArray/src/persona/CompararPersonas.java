package persona;

public class CompararPersonas {
    public static void main(String[] args) {
        Persona p1 = new Persona ();
        p1.nombre = "p1";
        Persona p2 = new Persona();
        p2.nombre = "p2";

        System.out.println(p1 == p2);
    }
}
