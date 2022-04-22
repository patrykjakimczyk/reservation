package pokoje;

//import Cennik;

public class Jedynka extends Pokoj{
    public final static String nazwa = "jedynka";

    public Jedynka(String typ, int iloscDni, boolean sniadanie) {
        super(typ, iloscDni, sniadanie);
    }

    public Jedynka(Jedynka j) {
        this.clone(j);
    }

    @Override
    public String toString() {
        String myString = "";
        myString = myString + nazwa + " " + pobierzTyp() + " " + pobierzIloscDni()+ " " + czySniadanie() + "\n";
        return myString;
    }

    public void clone(Jedynka j) {
        this.setTyp(j.pobierzTyp());
        this.setIloscDni(j.pobierzIloscDni());
        this.setSniadanie(j.czySniadanie());
    }

    public int porownywanie(PokojCennik p) {
        String rodzaj = p.pobierzRodzaj();
        String typ = p.pobierzTyp();
        if (this.nazwa.equals(rodzaj) && this.pobierzTyp().equals(typ)) return 0;
        return 1;
    }
}
