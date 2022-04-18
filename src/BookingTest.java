public class BookingTest {
    static int cena(Koszyk k, String typ) {
        /*<- tu trzeba wpisać ciało metody */
    }

    public static void main(String[] args) {

        // cennik
        Cennik cennik = Cennik.pobierzCennik();

        // dodawanie nowych cen do cennika
        cennik.dodaj("jedynka", "standard", 100, 15);	// pokój jednoosobowy typu standardowego kosztuje 100 zł/noc, śniadanie (opcja) kosztuje 15 zł

        cennik.dodaj("dwojka", "budzet", 140, 20);	// pokój dwuosobowy typu budżetowego kosztuje 140 zł/noc, śniadanie (opcja) kosztuje 20 zł

        cennik.dodaj("trojka", "standard", 300, 25);	// pokój trzyosobowy typu standardowego kosztuje 300 zł/noc, śniadanie (opcja) kosztuje 25 zł

        cennik.dodaj("rodzina", "premium", 500, 0);	// pokój rodzinny typu premium kosztuje 500 zł/noc, śniadanie (opcja) kosztuje 0 zł

        // Klient ocean deklaruje kwotę 2300 zł na rezerwacje
        Klient ocean = new Klient("ocean", 2300);

        // Klient ocean dodaje do listy życzeń różne rodzaje pokoi:
        // 4 noce w pokoju jednoosobowym typu standardowego ze śniadaniem, 5 nocy w pokoju trzyosobowym typu standardowego bez śniadania,
        // 3 noce w pokoju dwuosobowym typu premium bez śniadania, 3 noce w pokoju dwuosobowym budżetowym bez śniadania
        ocean.dodaj(new Jedynka("standard", 4, true));
        ocean.dodaj(new Trojka("standard", 5, false));
        ocean.dodaj(new Dwojka("premium", 3, false));
        ocean.dodaj(new Dwojka("budzet", 3, false));

        // Lista życzeń klienta ocean
        ListaZyczen listaOceanu = ocean.pobierzListeZyczen();

        System.out.println("Lista życzeń klienta " + listaOceanu);

        // Przed płaceniem, klient przepakuje pokoje z listy życzeń do koszyka.
        // Możliwe, że na liście życzeń są pokoje niemające ceny w cenniku,
        // w takim przypadku zostałyby usunięte z koszyka (ale nie z listy życzeń)
        Koszyk koszykOceanu = new Koszyk(ocean);
        ocean.przepakuj(koszykOceanu);

        // Co jest na liście życzeń klienta ocean
        System.out.println("Po przepakowaniu, lista życzeń klienta " + ocean.pobierzListeZyczen());

        // Co jest w koszyku klienta ocean
        System.out.println("Po przepakowaniu, koszyk klienta " + koszykOceanu);

        // Ile wynosi cena wszystkich pokoi typu standardowego w koszyku klienta ocean
        System.out.println("Pokoje standardowe w koszyku klienta ocean kosztowały:  "
                + cena(koszykOceanu, "standard"));

        // Klient zapłaci...
        ocean.zaplac("karta");	// płaci kartą płatniczą, bez prowizji

        // Ile klientowi ocean zostało pieniędzy?
        System.out.println("Po zapłaceniu, klientowi ocean zostało: " + ocean.pobierzPortfel() + " zł");

        // Mogło klientowi zabraknąć srodków, wtedy pokoje są odkładane,
        // w innym przypadku koszyk jest pusty po zapłaceniu
        System.out.println("Po zapłaceniu, koszyk klienta " + ocean.pobierzKoszyk());
        System.out.println("Po zapłaceniu, koszyk klienta " + koszykOceanu);

        // Teraz przychodzi klient morze,
        // deklaruje 780 zł na rezerwacje
        Klient morze = new Klient("morze", 780);

        // Zarezerwował za dużo jak na tę kwotę
        morze.dodaj(new Jedynka("standard", 3, false));
        morze.dodaj(new Dwojka("budzet", 4, false));

        // Co klient morze ma na swojej liście życzeń
        System.out.println("Lista życzeń klienta " + morze.pobierzListeZyczen());

        // Przepakowanie z listy życzeń do koszyka,
        // może się okazać, że na liście życzeń są pokoje niemające ceny w cenniku,
        // w takim razie zostałyby usunięte z koszyka (ale nie z listy życzeń)
        Koszyk koszykMorza = new Koszyk(morze);
        morze.przepakuj(koszykMorza);

        // Co jest na liście życzeń morze
        System.out.println("Po przepakowaniu, lista życzeń klienta " + morze.pobierzListeZyczen());

        // A co jest w koszyku klienta morze
        System.out.println("Po przepakowaniu, koszyk klienta " + morze.pobierzKoszyk());

        // klient morze płaci
        morze.zaplac("przelew");	// płaci przelewem, prowizja 5 PLN

        // Ile klientowi morze zostało pieniędzy?
        System.out.println("Po zapłaceniu, klientowi morze zostało: " + morze.pobierzPortfel() + " zł");

        // Co zostało w koszyku klienta morze (za mało pieniędzy miał)
        System.out.println("Po zapłaceniu, koszyk klienta " + koszykMorza);

    }
}
}
