package cts.decorator.clase;

public class RezultatOnline extends DecoratorAbstract {
    public RezultatOnline(FurnizeazaRezultat rh) {
        super(rh);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Web: " + diagnostic);
    }
}
