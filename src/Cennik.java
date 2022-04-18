import java.util.ArrayList;

public class Cennik {
    private ArrayList<pokojCennik> listaCennik;

    public Cennik() {
        this.listaCennik = null;
    }

    public static Cennik pobierzCennik() {

    }

    public void dodaj(String rodzaj, String typ, double cenaDoba, double cenaSniadanie) {
        listaCennik.add(new pokojCennik(rodzaj, typ, cenaDoba, cenaSniadanie));
    }

    class pokojCennik {
            private String rodzaj;
            private String typ;
            private double cenaDoba;
            private double cenaSniadanie;

            public pokojCennik(String rodzaj, String typ, double cenaDoba, double cenaSniadanie) {
                this.rodzaj = rodzaj;
                this.typ = typ;
                this.cenaDoba = cenaDoba;
                this.cenaSniadanie = cenaSniadanie;
            }
    }
}
