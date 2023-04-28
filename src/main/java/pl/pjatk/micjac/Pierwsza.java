package pl.pjatk.micjac;
import org.springframework.stereotype.Component;


@Component
public class Pierwsza {
    public Pierwsza() {
        System.out.println("Klasa pierwsza - informacja z konstruktora ");
    }

    public Pierwsza(Druga druga) {
        druga.metodaKlasyDrugiejJeden();
    }

 public void metodaKlasyPierwszejDwa() {
     System.out.println("metoda klasy pierwszej - druga ");
 }
 public void metodaKlasyPierwszejJeden() {
        System.out.println("metoda klasy pierwszej - pierwsza ");
    }
}
