import pokoje.PokojCennik;

import java.util.ArrayList;

public class Cennik {
    private static Cennik instance = null;
    private ArrayList<PokojCennik> listaCennik;

    public Cennik() {
        this.listaCennik = new ArrayList<PokojCennik>();
    }

    public static Cennik pobierzCennik() {
        if (instance == null) {
            instance = new Cennik();
        }
        return instance;
    }

    public ArrayList<PokojCennik> pobierzListe() {
        return this.listaCennik;
    }

    public void dodaj(String rodzaj, String typ, double cenaDoba, double cenaSniadanie) {
        listaCennik.add(new PokojCennik(rodzaj, typ, cenaDoba, cenaSniadanie));
    }

}
