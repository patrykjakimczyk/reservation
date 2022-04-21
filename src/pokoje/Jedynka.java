package pokoje;

//import Cennik;

public class Jedynka extends Pokoj{
    public final static String nazwa = "jedynka";

    public Jedynka(String typ, int iloscDni, boolean sniadanie) {
        super(typ, iloscDni, sniadanie);
    }

    public Jedynka(Jedynka j) {
        super();
        this.typ = j.pobierzTyp();
        this.iloscDni = j.iloscDni;
        this.sniadanie = j.sniadanie;
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
