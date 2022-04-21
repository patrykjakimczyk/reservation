package pokoje;

public class Dwojka extends Pokoj{
    public final static String nazwa = "dwojka";

    public Dwojka(Dwojka d) {
        super();
        this.typ = d.pobierzTyp();
        this.iloscDni = d.iloscDni;
        this.sniadanie = d.sniadanie;
    }

    public Dwojka(String typ, int iloscDni, boolean sniadanie) {
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
        if (this.nazwa.equals(rodzaj) && this.pobierzTyp().equals(typ)) return 0;
        return 1;
    }

}
