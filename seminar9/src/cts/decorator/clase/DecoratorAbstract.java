package cts.decorator.clase;

public abstract class DecoratorAbstract implements FurnizeazaRezultat {
    private final FurnizeazaRezultat fr;

    public DecoratorAbstract(FurnizeazaRezultat rh) {
        this.fr = rh;
    }

    @Override
    public void printareRezultat(String diagnostic) {
        this.fr.printareRezultat(diagnostic);
    }

    public abstract void afisareOnline(String diagnostic);
}
