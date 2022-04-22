package pokoje;

public class Rodzina extends Pokoj{
    public final static String nazwa = "rodzina";

    public Rodzina(Rodzina r) {
        this.clone(r);
    }

    public Rodzina(String typ, int iloscDni, boolean sniadanie) {
        super(typ, iloscDni, sniadanie);
    }

    @Override
    public String toString() {
        String myString = "";
        myString = myString + nazwa + " " + pobierzTyp() + " " + pobierzIloscDni()+ " " + czySniadanie() + "\n";
        return myString;
    }

    public void clone(Rodzina r) {
        this.setTyp(r.pobierzTyp());
        this.setIloscDni(r.pobierzIloscDni());
        this.setSniadanie(r.czySniadanie());
    }

    public int porownywanie(PokojCennik p) {
        String rodzaj = p.pobierzRodzaj();
        String typ = p.pobierzTyp();
        if (this.nazwa.equals(rodzaj) && this.pobierzTyp().equals(typ)) return 0;
        return 1;
    }
}
