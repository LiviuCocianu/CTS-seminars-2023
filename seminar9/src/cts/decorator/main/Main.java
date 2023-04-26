package cts.decorator.main;

import cts.decorator.clase.DecoratorAbstract;
import cts.decorator.clase.FurnizeazaRezultat;
import cts.decorator.clase.RezultatOnline;
import cts.decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizeazaRezultat rez = new RezultatPeHartie();
        DecoratorAbstract decor = new RezultatOnline(rez);

        rez.printareRezultat("Un rezultat");
        decor.afisareOnline("Un alt diagnostic");
    }
}
