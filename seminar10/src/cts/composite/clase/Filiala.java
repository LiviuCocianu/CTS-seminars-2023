package cts.composite.clase;

public class Filiala implements UnitateBancara {
    private final String nume;
    private final int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitate) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitate) {
        throw new RuntimeException();
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printDescriere(String identare) {
        System.out.println(identare + "Nume: " + this.nume + ", numar angajati: " + this.nrAngajati);
    }
}
