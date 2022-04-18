import pokoje.Pokoj;

import java.util.ArrayList;

public class Klient {
    private String nazwa;
    private double budzet;
    ArrayList<Pokoj> listaKlienta;

    public Klient(String nazwa, double budzet) {
        this.nazwa = nazwa;
        this.budzet = budzet;
    }

    public ArrayList<Pokoj> pobierzListeZyczen() {

    }

    public void dodaj(Pokoj p) {
        this.listaKlienta.add(p);
    }

    public void zaplac(String formaP) {
        if (formaP.equals("przelew")) {

        } else if (formaP.equals("karta")) {

        }
    }

    class pokojKlienta {
        private String rodzaj;
        private String typ;
        private double cenaDoba;
        private double cenaSniadanie;

        public pokojKlienta(String rodzaj, String typ, double cenaDoba, double cenaSniadanie) {
            this.rodzaj = rodzaj;
            this.typ = typ;
            this.cenaDoba = cenaDoba;
            this.cenaSniadanie = cenaSniadanie;
        }
    }
}
