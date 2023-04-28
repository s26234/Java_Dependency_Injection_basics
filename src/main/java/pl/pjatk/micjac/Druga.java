package pl.pjatk.micjac;

import org.springframework.stereotype.Component;

@Component
public class Druga {

    public Druga(Pierwsza pierwsza) {
        System.out.println("Klasa druga - informacja z konstruktora");
        pierwsza.metodaKlasyPierwszejDwa();
    }
    public void metodaKlasyDrugiejJeden() {
        System.out.println("metoda klasy drugiej - pierwsza ");
    }
}