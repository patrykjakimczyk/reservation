package pokoje;

public class Trojka extends Pokoj{
    public final static String nazwa = "trojka";

    public Trojka(Trojka t) {
        super();
        this.typ = t.pobierzTyp();
        this.iloscDni = t.iloscDni;
        this.sniadanie = t.sniadanie;
    }

    public Trojka(String typ, int iloscDni, boolean sniadanie) {
        super(typ, iloscDni, sniadanie);
    }

    @Override
    public String toString() {
        String myString = "";
        myString = myString + nazwa + " " + pobierzTyp() + " " + pobierzIloscDni()+ " " + czySniadanie() + "\n";
        return myString;
    }
    public int porownywanie(PokojCennik p) {
        String rodzaj = p.pobierzRodzaj();
        String typ = p.pobierzTyp();
        if (this.nazwa.equals(rodzaj) && this.typ.equals(typ)) return 0;
        return 1;
    }
}
