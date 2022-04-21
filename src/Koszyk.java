import pokoje.*;

import java.util.ArrayList;

public class Koszyk {
    private ListaZyczen KoszykKlienta;

    public Koszyk(Klient k) {
//        this.KoszykKlienta = new ListaZyczen();
//        for (Pokoj p : this.KoszykKlienta.pobierzListaZ()) {
//            if (p instanceof Jedynka) {
//                Jedynka jedynka = (Jedynka) p;
//                this.KoszykKlienta.dodaj(new Jedynka(jedynka));
//            } else if (p instanceof Dwojka) {
//                Dwojka dwojka = (Dwojka) p;
//                this.KoszykKlienta.dodaj(new Dwojka(dwojka));
//            } else if (p instanceof Trojka) {
//                Trojka trojka = (Trojka) p;
//                this.KoszykKlienta.dodaj(new Trojka(trojka));
//            } else if (p instanceof Rodzina) {
//                Rodzina rodzina = (Rodzina) p;
//                this.KoszykKlienta.dodaj(new Rodzina(rodzina));
//            }
//        }
        this.KoszykKlienta = k.pobierzListeZyczen().clone();
    }

    public ListaZyczen pobierzKoszyk() {
        return this.KoszykKlienta;
    }

    @Override
    public String toString() {
        return this.KoszykKlienta.toString();
    }
}
