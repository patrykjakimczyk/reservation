package pokoje;

import java.util.ArrayList;

public abstract class Pokoj implements Cloneable{
    protected String typ;
    protected int iloscDni;
    protected boolean sniadanie;

    public Pokoj() {
        this.typ = "";
        this.iloscDni = 0;
        this.sniadanie = false;
    }

    public Pokoj(String typ, int iloscDni, boolean sniadanie) {
        this.typ = typ;
        this.iloscDni = iloscDni;
        this.sniadanie = sniadanie;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setIloscDni(int iloscDni) {
        this.iloscDni = iloscDni;
    }

    public void setSniadanie(boolean sniadanie) {
        this.sniadanie = sniadanie;
    }

    @Override
    public Pokoj clone() {
        Pokoj clone = null;
        try {
            clone = (Pokoj)super.clone();
            clone.setTyp((String)this.typ.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public String pobierzTyp() {
        return typ;
    }

    public int pobierzIloscDni() {
        return iloscDni;
    }

    public boolean czySniadanie() {
        return sniadanie;
    }
}
