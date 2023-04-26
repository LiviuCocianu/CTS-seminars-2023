package cts.decorator.clase;

public class RezultatPeHartie implements FurnizeazaRezultat {
    @Override
    public void printareRezultat(String diagnostic) {
        System.out.println("Hartie: " + diagnostic);
    }
}
