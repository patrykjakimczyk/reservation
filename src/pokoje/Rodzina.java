package pokoje;

public class Rodzina extends Pokoj{
    private final static String nazwa = "rodzina";

    public Rodzina(String rodzaj, int iloscDni, boolean sniadanie) {
        super(rodzaj, iloscDni, sniadanie);
    }
}
