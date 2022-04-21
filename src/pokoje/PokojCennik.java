package pokoje;

public class PokojCennik {
    private String rodzaj;
    private String typ;
    private double cenaDoba;
    private double cenaSniadanie;

    public PokojCennik(String rodzaj, String typ, double cenaDoba, double cenaSniadanie) {
        this.rodzaj = rodzaj;
        this.typ = typ;
        this.cenaDoba = cenaDoba;
        this.cenaSniadanie = cenaSniadanie;
    }
    public String pobierzRodzaj() {
        return rodzaj;
    }

    public String pobierzTyp() {
        return typ;
    }

    public double pobierzDoba() {
        return cenaDoba;
    }

    public double pobierzCenaSniadanie() {
        return cenaSniadanie;
    }
}

