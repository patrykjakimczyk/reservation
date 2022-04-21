import pokoje.*;

import java.util.List;

public class Klient {
    private String nazwa;
    private double Portfel;
    private ListaZyczen listaKlienta;

    public Klient(String nazwa, double budzet) {
        this.nazwa = nazwa;
        this.Portfel = budzet;
        this.listaKlienta = new ListaZyczen();
    }

    public double pobierzPortfel() {
        return Portfel;
    }

    public ListaZyczen pobierzListeZyczen() {
        return this.listaKlienta;
    }

    public void dodaj(Pokoj p) {
        this.listaKlienta.dodaj(p);
    }

//    public void zaplac(String formaP) {
//        if (formaP.equals("przelew")) {
//
//        } else if (formaP.equals("karta")) {
//
//        }
//    }

//    public String pobierzKoszyk() {
//    }

    public void przepakuj(Koszyk k) {
        Cennik cennik = Cennik.pobierzCennik();
        List<PokojCennik> pokojeCennik = cennik.pobierzListe();
        List<Pokoj> pokoje = this.listaKlienta.pobierzListaZ();

        for (int i = 0; i < pokojeCennik.size(); i++) {
            for (int j = 0; j < pokoje.size(); j++) {
                if (pokoje.get(j) instanceof Jedynka) {
                    Jedynka jedynka = (Jedynka) pokoje.get(j);
                    if (jedynka.porownywanie(pokojeCennik.get(i)) != 0) {
                        k.pobierzKoszyk().wypakuj(pokoje.get(j));
                    } else {
                        System.out.println(pokoje.get(j));
                        this.listaKlienta.wypakuj(pokoje.get(j));
                    }
                } else if (pokoje.get(j) instanceof Dwojka) {
                    Dwojka dwojka = (Dwojka) pokoje.get(j);
                    if (dwojka.porownywanie(pokojeCennik.get(i)) == 0) {
                        System.out.println(pokoje.get(j));
                        k.pobierzKoszyk().wypakuj(pokoje.get(j));
                    } else {
                        System.out.println(pokoje.get(j));
                        this.listaKlienta.wypakuj(pokoje.get(j));
                    }
                } else if (pokoje.get(j) instanceof Trojka) {
                    Trojka trojka = (Trojka) pokoje.get(j);
                    if (trojka.porownywanie(pokojeCennik.get(i)) == 0) {
                        k.pobierzKoszyk().wypakuj(pokoje.get(j));
                    } else {
                        System.out.println(pokoje.get(j));
                        this.listaKlienta.wypakuj(pokoje.get(j));
                    }
                } else if (pokoje.get(j) instanceof Rodzina) {
                    Rodzina rodzina = (Rodzina) pokoje.get(j);
                    if (rodzina.porownywanie(pokojeCennik.get(i)) == 0) {
                        k.pobierzKoszyk().wypakuj(pokoje.get(j));
                    } else {
                        this.listaKlienta.wypakuj(pokoje.get(j));
                    }
                }
            }
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
