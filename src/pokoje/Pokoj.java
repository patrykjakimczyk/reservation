package pokoje;

public abstract class Pokoj {
    private String rodzaj;
    private int iloscDni;
    boolean sniadanie;

    public Pokoj(String rodzaj, int iloscDni, boolean sniadanie) {
        this.rodzaj = rodzaj;
        this.iloscDni = iloscDni;
        this.sniadanie = sniadanie;
    }
}
