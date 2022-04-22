package pokoje;

public class Trojka extends Pokoj{
    public final static String nazwa = "trojka";

    public Trojka(Trojka t) {
        this.clone(t);
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
    public void clone(Trojka t) {
        this.setTyp(t.pobierzTyp());
        this.setIloscDni(t.pobierzIloscDni());
        this.setSniadanie(t.czySniadanie());
    }

    public int porownywanie(PokojCennik p) {
        String rodzaj = p.pobierzRodzaj();
        String typ = p.pobierzTyp();
        if (this.nazwa.equals(rodzaj) && this.typ.equals(typ)) return 0;
        return 1;
    }

    public int porownywanie(Trojka t) {
        if (this.nazwa.equals(t.nazwa) && this.typ.equals(t.typ)) return 0;
        return 1;
    }
}
