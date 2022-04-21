import pokoje.Pokoj;

import java.util.ArrayList;

public class ListaZyczen {
    private ArrayList<Pokoj> listaZ;

    ListaZyczen() {
        listaZ = new ArrayList<Pokoj>();
    }

    public void dodaj(Pokoj p) {
        this.listaZ.add(p);
    }

    public ArrayList<Pokoj> pobierzListaZ() {
        return listaZ;
    }

    public void wypakuj(Pokoj p) {
        this.listaZ.remove(p);
    }

    public void setListaZ(ArrayList<Pokoj> listaZ) {
        this.listaZ = listaZ;
    }

    @Override
    public String toString() {
        String myString = "\n";
        StringBuilder myStringB = new StringBuilder(myString);

        for (Pokoj p : listaZ) {
            myStringB.append(p.toString());
        }
        return myStringB.toString();
    }
}
